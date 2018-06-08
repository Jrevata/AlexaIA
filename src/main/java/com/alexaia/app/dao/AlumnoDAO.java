package com.alexaia.app.dao;

import com.alexaia.app.models.Alumno;

public interface AlumnoDAO {

	
	Alumno validate(String usuario, String clave);
	
}
