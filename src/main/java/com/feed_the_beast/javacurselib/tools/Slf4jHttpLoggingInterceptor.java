package com.feed_the_beast.javacurselib.tools;

import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

@Slf4j
public class Slf4jHttpLoggingInterceptor implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(String message) {
        // KISS! Log everything through Slf4j, censor AuthToken
        if (message.startsWith("AuthenticationToken")) {
            log.trace("AuthenticationToken<CENSORED>");
            return;
        }
        log.trace(message);
    }
}
