package com.alexaia.app.services;

import com.alexaia.app.models.Alumno;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

	    @FormUrlEncoded
	    @POST("login")
	    Call<Alumno> login(@Field("usuario")String usuario,
	                       @Field("clave") String clave);
	
}
