package com.alexaia.app;



import org.apache.commons.logging.Log;

import com.alexaia.app.models.Alumno;
import com.alexaia.app.services.ApiService;
import com.alexaia.app.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppMain {

	private static final String TAG = AppMain.class.getSimpleName();
	
	public static void main(String[] args) {
		ApiService api = ApiServiceGenerator.createService(ApiService.class);
		
		
		
		Call<Alumno> call;
        call = api.login("106547" , "779550111");

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

	}

}
