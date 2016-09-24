package com.feed_the_beast.javacurselib.examples.app_v1;

import com.curse.addonservice.AddOnService;
import com.curse.addonservice.IAddOnService;
import com.curse.clientservice.ObjectFactory;
import com.feed_the_beast.javacurselib.addondumps.Bz2Data;
import com.feed_the_beast.javacurselib.addondumps.DatabaseType;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfArrayOfSavedGameeheogrl4;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

/**
 * Created by progwml6 on 9/1/16.
 */
public class SoapLogin {
    public static void main (String args[]) {
        String user = args[0];
        String pass = args[1];
        ObjectFactory clientLoginFactory = new ObjectFactory();
        org.datacontract.schemas._2004._07.curse_serviceauthentication.ObjectFactory authFac = new org.datacontract.schemas._2004._07.curse_serviceauthentication.ObjectFactory();
        LoginRequest lr = new LoginRequest();
        lr.setUsername(authFac.createLoginRequestUsername(user));
        lr.setPassword(authFac.createLoginRequestPassword(pass));
        JAXBElement<LoginRequest> reqElement = clientLoginFactory.createLoginLoginRequest(lr);
        AddOnService addonService = new AddOnService();
        AddressingFeature af = new AddressingFeature();
        IAddOnService svc = addonService.getWsHttpAddOnServiceEndpoint(af);
        //svc.getSecureDownloadToken();

        System.out.println("health -- " + svc.healthCheck());
        ServiceResponseOfArrayOfSavedGameeheogrl4 svcgames = svc.getSavedGames();
        System.out.println(svc.getSavedGames());
        System.out.println(svc.getAllFilesForAddOn(0000));


        /*System.out.println(Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.HOURLY));
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println(Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.COMPLETE));
**/
    }
}
