package com.alexaia.app.services;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServiceGenerator {

	 static String API_BASE_URL="http://campus.tecsup.edu.pe/campus-rest/";

	 private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	    private static Retrofit.Builder builder = new Retrofit.Builder()
	            .baseUrl(API_BASE_URL)
	            .addConverterFactory(GsonConverterFactory.create());

	    private static Retrofit retrofit;

	    private ApiServiceGenerator() {
	    }

	    public static <S> S createService(Class<S> serviceClass) {
	        if(retrofit == null) {
	            retrofit = builder.client(httpClient.build()).build();
	        }
	        return retrofit.create(serviceClass);
	    }
	
}
