package com.alexaia.app.models;

import java.sql.Timestamp;

public class Evento {

	private int id;
    private int usuarios_id;
    private String titulo;
    private String contenido;
    private String fecha_inicio;
    private String fecha_final;
    private int estado;
    private String imagen;
    
    public Evento() {}
    
    
    
	public Evento( int id_usuario, String titulo, String contenido,  String fecha_final, String imagen) {
		super();
		
		this.usuarios_id = id_usuario;
		this.titulo = titulo;
		this.contenido = contenido;
		this.fecha_final = fecha_final;
		this.imagen = imagen;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_usuario() {
		return usuarios_id;
	}
	public void setId_usuario(int id_usuario) {
		this.usuarios_id = id_usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", usuarios_id=" + usuarios_id + ", titulo=" + titulo + ", contenido=" + contenido
				+ ", fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + ", estado=" + estado + ", imagen="
				+ imagen + "]";
	}
	
    
}
