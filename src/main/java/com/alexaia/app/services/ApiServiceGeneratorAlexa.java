package com.alexaia.app.services;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServiceGeneratorAlexa{

	static String API_BASE_URL="https://alexaia-api-jrevata.c9users.io";
	
	 private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	    private static Retrofit.Builder builder = new Retrofit.Builder()
	            .baseUrl(API_BASE_URL)
	            .addConverterFactory(GsonConverterFactory.create());

	    private static Retrofit retrofit;

	    private ApiServiceGeneratorAlexa() {
	    }

	    public static <S> S createService(Class<S> serviceClass) {
	        if(retrofit == null) {
	            retrofit = builder.client(httpClient.build()).build();
	        }
	        return retrofit.create(serviceClass);
	    }
	
}
