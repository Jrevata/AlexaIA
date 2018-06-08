package com.alexaia.app.services;

import java.util.List;

import com.alexaia.app.models.Evento;
import com.alexaia.app.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiServiceAlexa {

	@GET("/api/eventos")
    Call<List<Evento>> getEventos();

    @FormUrlEncoded
    @POST("/api/eventos")
    Call<Evento> createEvento(  @Field("titulo") String titulo,
                                         @Field("usuarios_id") Integer usuarios_id,
                                         @Field("contenido") String contenido,                                    
                                         @Field("fecha_final") String fecha_final,
                                         @Field("imagen") String imagen
                                       );
   
    
    @PATCH("/api/eventos/{id}")
    Call<Evento> updateEvento(@Path("id") Integer id,
    		@Body Evento evento );
    
    @GET("/api/usuario/{username}/ver")
    Call<Usuario> verificarUsuario(@Path("username") String username);
	
    
    @GET("/api/eventos/{usuarios_id}/ver")
    Call<List<Evento>> getEventosbyUser(@Path("usuarios_id") Integer id);
    
    @GET("/api/eventos/{id}")
    Call<Evento> getEventobyId(@Path("id") Integer id);
    
    @DELETE("/api/eventos/{id}")
    Call<Evento> deleteEvento(@Path("id") Integer id);
    
    @GET("/api/eventos/{fecha}/mostrar")
    Call<List<Evento>> mostrarEvento(@Path("fecha") String fecha);
}
