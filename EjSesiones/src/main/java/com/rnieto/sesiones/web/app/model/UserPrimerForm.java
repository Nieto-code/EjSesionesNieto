package com.rnieto.sesiones.web.app.model;

import java.util.List;

public class UserPrimerForm {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechaNac;
	private String siglaGenero;
	private List<String> est_Civil_e_Hijos;
	private List<String> nacionalidades;

	public UserPrimerForm() {
	}

	public UserPrimerForm(String nombre, String apellido1, String apellido2, String fechaNac, String siglaGenero,
			List<String> est_Civil_e_Hijos, List<String> nacionalidades) {
	
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNac = fechaNac;
		this.siglaGenero = siglaGenero;
		this.est_Civil_e_Hijos = est_Civil_e_Hijos;
		this.nacionalidades = nacionalidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSiglaGenero() {
		return siglaGenero;
	}

	public void setSiglaGenero(String siglaGenero) {
		this.siglaGenero = siglaGenero;
	}

	public List<String> getEst_Civil_e_Hijos() {
		return est_Civil_e_Hijos;
	}

	public void setEst_Civil_e_Hijos(List<String> est_Civil_e_Hijos) {
		this.est_Civil_e_Hijos = est_Civil_e_Hijos;
	}

	public List<String> getNacionalidades() {
		return nacionalidades;
	}

	public void setNacionalidades(List<String> nacionalidades) {
		this.nacionalidades = nacionalidades;
	}

}
