package com.joaorock.lineup.bands.utils;

import com.google.gson.Gson;

/**
 * Created by Lucas on 21/07/2018.
 */
public class DataConversion {
    private static final Gson GSON_INSTANCE = new Gson();

    public static <T> String getJson(T t){
        return GSON_INSTANCE.toJson(t);
    }

    public static <T> T getObject(String message,Class<T> clazz){
        return GSON_INSTANCE.fromJson(message,clazz);
    }
}
