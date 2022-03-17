package com.rnieto.sesiones.web.app.model;

public class UserTercerForm {

	private String cuentaBancaria;
	
	public UserTercerForm() {
		
	}

	public UserTercerForm(String cuentaBancaria) {
		
		this.cuentaBancaria = cuentaBancaria;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
}
