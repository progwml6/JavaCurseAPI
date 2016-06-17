package com.feed_the_beast.javacurselib.utils;

import retrofit2.adapter.java8.HttpException;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class ExceptionHelper {
    private static final Logger logger = Logger.getLogger(ExceptionHelper.class.getName());
    private ExceptionHelper() {
    }

    public static void analyzeRestExecutionException(ExecutionException e) {
        Throwable t = e.getCause();
        if (t instanceof HttpException) {
            logger.severe("HTTP request failed: Response code: " + ((HttpException) t).code());
            logger.finest(t.toString());
        } else {
            logger.severe("HTTP request failed: " + t.getMessage());
            logger.finest(t.toString());
        }
    }
}
