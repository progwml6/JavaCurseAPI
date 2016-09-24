package com.feed_the_beast.javacurselib.soap;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

@Slf4j
public class CurseAuthHandler implements SOAPHandler<SOAPMessageContext> {
    private SoapAuthenticationToken token;

    public CurseAuthHandler (SoapAuthenticationToken token) {
        this.token = token;
    }

    public Set<QName> getHeaders () {
        return new TreeSet();
    }

    public boolean handleMessage (SOAPMessageContext context) {
        System.out.println("handling message for header");
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            SOAPMessage message = context.getMessage();
            try {
                SOAPEnvelope envelope = context.getMessage()
                        .getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                String prefix = "";
                String uri = "urn:Curse.FriendsService:v1";
                String headerText = "AuthenticationToken";
                SOAPElement elem = header.addChildElement(headerText, prefix, uri);
                SOAPElement uid = elem.addChildElement("UserID");
                uid.addTextNode(String.valueOf(token.UserID));
                SOAPElement ctoken = elem.addChildElement("Token");
                ctoken.addTextNode(String.valueOf(token.Token));
                SOAPElement apikey = elem.addChildElement("ApiKey");
                if (token.ApiKey != null) {
                    apikey.addTextNode(String.valueOf(token.ApiKey));
                }
                System.out.println("added header");
            } catch (Exception e) {
                log.error("Exception in handler: ", e);
            }
        } else {
            // inbound
        }
        return true;
    }

    public boolean handleFault (SOAPMessageContext context) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void close (MessageContext context) {
        //
    }
}