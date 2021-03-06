/*
 * Adapted from: https://raw.githubusercontent.com/square/retrofit/473fd2473cc41e68eb61c6d2d4316d720edd46fb/retrofit-converters/gson/src/main/java/retrofit2/converter/gson/GsonRequestBodyConverter.java
 */
/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feed_the_beast.javacurselib.utils.retrofit;

import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

    private final Gson gson;

    GsonRequestBodyConverter(Gson gson) {
        this.gson = gson;
    }

    @Override public RequestBody convert(T value) throws IOException {
        String request = gson.toJson(value);
        return RequestBody.create(MEDIA_TYPE, request);
    }
}
