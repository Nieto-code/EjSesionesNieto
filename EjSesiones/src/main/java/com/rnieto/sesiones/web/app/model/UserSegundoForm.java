package com.rnieto.sesiones.web.app.model;

public class UserSegundoForm {

	private String siglaDepartamento;
	private String salario;
	private String comentarios;
	
	
	
	
	
	public UserSegundoForm() {
	
	}

	public UserSegundoForm(String siglaDepartamento, String salario, String comentarios) {
	
		this.siglaDepartamento = siglaDepartamento;
		this.salario = salario;
		this.comentarios = comentarios;
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
	
	
	
}
