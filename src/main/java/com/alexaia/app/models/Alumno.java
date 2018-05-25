package com.alexaia.app.models;

import java.util.HashMap;
import java.util.Map;

public class Alumno {

	private String token;

    private String usuario;

    private Integer codigo;

    private String nomuno;

    private String nomdos;

    private String paterno;

    private String materno;

    private String correo;

    private Integer rol;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getNomuno() {
        return nomuno;
    }


    public void setNomuno(String nomuno) {
        this.nomuno = nomuno;
    }


    public String getNomdos() {
        return nomdos;
    }


    public void setNomdos(String nomdos) {
        this.nomdos = nomdos;
    }


    public String getPaterno() {
        return paterno;
    }


    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }


    public String getMaterno() {
        return materno;
    }


    public void setMaterno(String materno) {
        this.materno = materno;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public Integer getRol() {
        return rol;
    }


    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


	@Override
	public String toString() {
		return "Alumno [token=" + token + ", usuario=" + usuario + ", codigo=" + codigo + ", nomuno=" + nomuno
				+ ", nomdos=" + nomdos + ", paterno=" + paterno + ", materno=" + materno + ", correo=" + correo
				+ ", rol=" + rol + ", additionalProperties=" + additionalProperties + "]";
	}
    
    
	
}
