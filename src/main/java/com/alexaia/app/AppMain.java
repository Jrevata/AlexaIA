package com.alexaia.app;



import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.net.ssl.SSLContext;

import org.apache.commons.logging.Log;

import com.alexaia.app.models.Alumno;
import com.alexaia.app.models.Evento;
import com.alexaia.app.services.ApiService;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGenerator;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppMain {

	private static final String TAG = AppMain.class.getSimpleName();
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
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
			
		}
        
        
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
