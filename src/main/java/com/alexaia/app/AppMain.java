package com.alexaia.app;



import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.net.ssl.SSLContext;

import org.apache.commons.logging.Log;

import com.alexaia.app.controllers.LoginController;
import com.alexaia.app.dao.AlumnoDAO;
import com.alexaia.app.models.Alumno;
import com.alexaia.app.models.Evento;
import com.alexaia.app.models.Usuario;
import com.alexaia.app.services.ApiService;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGenerator;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppMain {

	private static final String TAG = AppMain.class.getSimpleName();
	
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException, ParseException {
		
		
		/*
		String date = "2018-12-05 15:13:13";
		
		char[] array = date.toCharArray();
		
		String fecha = "";
		String hora  = "";
		
		for(int i = 0; i <= 9; i++) {
			fecha = fecha + array[i];
			
		}
		
		for(int i = 11; i < array.length; i++) {
			hora = hora + array[i];
			
		}
		System.out.println(fecha + " / " + hora);
		*/
		/*ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
		
		Evento ev = new Evento(1, "Avence", "nada", "2018-06-07 15:12:00", "dimagen.jpg");
		
		Evento event = api.updateEvento(1, ev).execute().body();
		System.out.println(event);*/
		
		Date date = new Date();
		String mes = String.valueOf(date.getMonth()+1);
		if(date.getMonth()+1 < 10)
			mes = "0" + String.valueOf(date.getMonth()+1);
		System.out.println(mes);
		
		String dia = String.valueOf(date.getDate());
		if(date.getDate()<10)
			dia="0"+String.valueOf(date.getDate());
		String fecha = date.getYear()+1900 + "-" + mes + "-" +dia +"+"+1;
		System.out.println(dia);
		String dia2 = String.valueOf(date.getDate()+1);
		
		if(date.getDate()+1 < 10)
			dia2 = 0 + String.valueOf(date.getDate()+1);
		
		//String fecha2 = date.getYear()+1900 + "-" + mes + "-" +dia2 +"+"+LoginController.usuario.getId();
		
		ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
		
		List<Evento> x = api.mostrarEvento(fecha).execute().body();
		System.out.println(x.get(0));
		
		/*
		Call<Evento> evento;
		evento = api.updateEvento(1, ev);
		
		evento.enqueue(new Callback<Evento>() {

			@Override
			public void onFailure(Call<Evento> arg0, Throwable arg1) {
				System.out.println("Aca el error we");
				arg1.printStackTrace();
				
			}

			@Override
			public void onResponse(Call<Evento> arg0, Response<Evento> response) {
				
				 int statusCode = response.code();
	                System.out.println(statusCode);

	                if (response.isSuccessful()) {

	                    Evento event = response.body();
	                    System.out.println(event);

	                } else {
	                    try {
	                       
	                        throw new Exception("Error en el servicio");
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
				
			}
		});
		*/
		
	/*
		
		
		Usuario x = api.verificarUsuario("106547").execute().body();
		
		System.out.println(x);
		*/
		/*
		ApiService api = ApiServiceGenerator.createService(ApiService.class);
		
		ApiServiceAlexa api2 = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
		
		//Call<Alumno> call;
        //call = api.login("106547" , "779550111");
        
        try {
			Alumno alumno_autenticado = api.login("106547", "779550111").execute().body();
			//System.out.println(alumno_autenticado.toString());
			if(alumno_autenticado==null)
				System.out.println("Usuario o c asdsad");
			else
				System.out.println(alumno_autenticado.toString());
		} catch (IOException e) {
			//logger.error(e.toString(), e);
			e.printStackTrace();
			
		}
      
        
        try {
			List<Evento> alumno_autenticado1 = api2.getEventos().execute().body();
			//System.out.println(alumno_autenticado.toString());
			
			System.out.println(alumno_autenticado1.get(0));
			
			
		} catch (IOException e) {
			//logger.error(e.toString(), e);
			e.printStackTrace();
			
		}*/
        
        
        /*
        Call<List<Evento>> call = api2.getEventos();
        System.setProperty("https.protocols", "TLSv1");
        call.enqueue(new Callback<List<Evento>>() {
            @Override
            public void onResponse(Call<List<Evento>> call, Response<List<Evento>> response) {

                int statusCode = response.code();
                System.out.println(statusCode);

                if (response.isSuccessful()) {

                    List<Evento> event = response.body();
                    System.out.println(event.get(0).toString());

                } else {
                    try {
                       
                        throw new Exception("Error en el servicio");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

            @Override
            public void onFailure(Call<List<Evento>> call, Throwable t) {
            	
            	System.out.println("Aca el error we");
                t.printStackTrace();
               
            }

        });
        */
        
        
        /*
        call.enqueue(new Callback<Alumno>() {
            @Override
            public void onResponse(Call<Alumno> call, Response<Alumno> response) {
                try{
                    int statusCode = response.code();
                    
                   

                    if (response.isSuccessful()){
                       Alumno x = new Alumno();
                       x =response.body();
                       System.out.println(x.toString());
                    }else {
                        System.out.println(response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }
                }catch(Throwable t) {
                    try {
                        t.printStackTrace();
                       
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<Alumno> call, Throwable t) {
                t.printStackTrace();
            }
        });
*/
	}

}
