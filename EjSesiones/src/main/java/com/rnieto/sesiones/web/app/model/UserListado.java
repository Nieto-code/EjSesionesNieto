package com.rnieto.sesiones.web.app.model;

import java.util.List;

public class UserListado {

	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechaNac;
	private String siglaGenero;
	private List<String> est_Civil_e_Hijos;
	private List<String> nacionalidades;

	private String siglaDepartamento;
	private String salario;
	private String comentarios;
	
	private String cuentaBancaria;

	public UserListado() {
	
	}

	public UserListado(String nombre, String apellido1, String apellido2, String fechaNac, String siglaGenero,
			List<String> est_Civil_e_Hijos, List<String> nacionalidades, String siglaDepartamento, String salario,
			String comentarios, String cuentaBancaria) {
	
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNac = fechaNac;
		this.siglaGenero = siglaGenero;
		this.est_Civil_e_Hijos = est_Civil_e_Hijos;
		this.nacionalidades = nacionalidades;
		this.siglaDepartamento = siglaDepartamento;
		this.salario = salario;
		this.comentarios = comentarios;
		this.cuentaBancaria = cuentaBancaria;
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

	public String getSiglaDepartamento() {
		return siglaDepartamento;
	}

	public void setSiglaDepartamento(String siglaDepartamento) {
		this.siglaDepartamento = siglaDepartamento;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
	
}
