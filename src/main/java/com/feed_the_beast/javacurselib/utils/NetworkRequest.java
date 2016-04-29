package com.feed_the_beast.javacurselib.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by progwml6 on 4/28/16.
 */
public class NetworkRequest {

    public static String getJson (String url, String token) {
        return executeGet(url, token);
    }

    public static String postJson (String url, String json) {
        return executePost(url, json);
    }

    /**
     * TODO redo this to use threads
     * quick and dirty approach DO NOT USE THIS FOR RELEASE
     * @param urlString the URL of the API
     * @param token curse token
     * @return api response
     */
    public static String executeGet (String urlString, String token) {
        URL url;
        HttpsURLConnection connection = null;
        try {
            url = new URL(urlString);
            connection = (HttpsURLConnection) url.openConnection();
            connection.addRequestProperty("AuthenticationToken", token);
            connection.connect();
            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {

            e.printStackTrace();
            return null;

        } finally {

            if (connection != null) {
                connection.disconnect();
            }
        }

    }

    /**
     * TODO redo this to use threads
     * quick and dirty approach DO NOT USE THIS FOR RELEASE
     * @param targetURL api url
     * @param json json api data
     * @return api response
     */
    private static String executePost (String targetURL, String json) {
        URL url;
        HttpsURLConnection connection = null;
        try {
            //Create connection
            url = new URL(targetURL);
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/json");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(
                    connection.getOutputStream());
            wr.writeBytes(json);
            wr.flush();
            wr.close();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        } finally {

            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}
