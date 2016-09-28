package com.feed_the_beast.javacurselib.examples.app_v1;

import com.curse.addonservice.AddOnService;
import com.curse.addonservice.IAddOnService;
import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.soap.CurseAuthHandler;
import com.feed_the_beast.javacurselib.soap.SoapAuthenticationToken;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.extern.slf4j.Slf4j;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfArrayOfSavedGameeheogrl4;
import retrofit2.adapter.java8.HttpException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;

/**
 * Created by progwml6 on 9/1/16.
 */
@Slf4j
public class SoapLogin {
    private static CreateSessionResponse sessionResponse = null;

    public static void main (String args[]) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        String user = args.length >= 2 ? args[0] : System.getenv("JAVACURSEAPI_USER");
        String pass = args.length >= 2 ? args[1] : System.getenv("JAVACURSEAPI_PASS");

        AddOnService addonService = new AddOnService();
        //addonService.setHandlerResolver();
        AddressingFeature af = new AddressingFeature(true, true, AddressingFeature.Responses.ANONYMOUS);
        IAddOnService svc = addonService.getWsHttpAddOnServiceEndpoint(af);
        BindingProvider bindingProvider = (BindingProvider) svc;
        final Binding binding = bindingProvider.getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        if (handlerList == null) {
            handlerList = new ArrayList<Handler>();
            System.out.println("Handlers null");
        }
        //cs token needs to be grabbed from that rest adapter api lasts ~ an hour
        long userId = 27864185;
        String cstoken = "";
        handlerList.add(new CurseAuthHandler(new SoapAuthenticationToken(userId, cstoken)));//lr.session.token

        binding.setHandlerChain(handlerList);

        //svc.getSecureDownloadToken();

        //System.out.println("health -- " + svc.healthCheck());
        try {//no token!!
            svc.getAddOn(220606);
            // ServiceResponseOfArrayOfSavedGameeheogrl4 svcgames = svc.getSavedGames();
        } catch (WebServiceException wse) {
            log.error("wse exc", wse);
        }
        // System.out.println(svc.getSavedGames());
        //  System.out.println(svc.getAllFilesForAddOn(0000));


        /*System.out.println(Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.HOURLY));
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println(Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.COMPLETE));
**/
    }
}
