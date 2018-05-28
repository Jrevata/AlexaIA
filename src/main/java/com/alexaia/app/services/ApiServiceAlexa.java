package com.alexaia.app.services;

import java.util.List;

import com.alexaia.app.models.Evento;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServiceAlexa {

	@GET("/api/eventos")
    Call<List<Evento>> getEventos();

    @FormUrlEncoded
    @POST("/api/eventos")
    Call<Evento> createEvento(  @Field("titulo") String titulo,
                                         @Field("usuarios_id") String usuarios_id,
                                         @Field("contenido") String contenido,
                                         @Field("fecha_inicio") String fecha_inicio,
                                         @Field("fecha_final") String fecha_final
                                       );
	
}
