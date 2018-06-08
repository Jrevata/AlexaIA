package com.alexaia.app.dao;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alexaia.app.controllers.LoginController;
import com.alexaia.app.models.Alumno;
import com.alexaia.app.services.ApiService;
import com.alexaia.app.services.ApiServiceGenerator;

public class AlumnoDAOImpl implements AlumnoDAO{

	private static final Logger logger = LoggerFactory.getLogger(AlumnoDAOImpl.class);
	
	@Override
	public Alumno validate(String usuario, String clave) {
		
		
ApiService api = ApiServiceGenerator.createService(ApiService.class);
		Alumno alumno_autenticado;
		
		
		try {
			alumno_autenticado = api.login(usuario, clave).execute().body();
			return alumno_autenticado;
		} catch (IOException e) {
			logger.error(e.toString(), e);
			e.printStackTrace();
		}
		return null;
	}

}
