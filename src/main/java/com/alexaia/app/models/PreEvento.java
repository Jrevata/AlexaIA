package com.alexaia.app.models;

import java.sql.Time;
import java.util.Date;

public class PreEvento {

	private String titulo;
	private String imagen;
	private String fecha_fin;
	private String hora_fin;
	private String descripcion;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "PreEvento [titulo=" + titulo + ", imagen=" + imagen + ", fecha_fin=" + fecha_fin + ", hora_fin="
				+ hora_fin + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
