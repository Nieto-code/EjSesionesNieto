package com.rnieto.sesiones.web.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Colecciones {
	
	//colecciones para el primer formulario
	public static SortedMap<String, String> listaGenerosOrdenada= new TreeMap<String, String>();
	public static SortedMap<String, String> listaCasadoEHijosOrdenada= new TreeMap<String, String>();
	public static SortedMap<String, String> listaNacionalidadesOrdenada= new TreeMap<String, String>();
	public static SortedMap<String, String> listaDepartamentosOrdenada= new TreeMap<String, String>();
	
	public static List<UserListado> listaUsuariosListado = new ArrayList<UserListado>();
	public static LinkedHashMap<String, String> datosFragment= new LinkedHashMap<String, String>();

	static {
		
		listaGenerosOrdenada.put("H", "Hombre");
		listaGenerosOrdenada.put("M", "Mujer");
		listaGenerosOrdenada.put("O", "Otro");
		
		listaCasadoEHijosOrdenada.put("C","Casado o Pareja de Hecho");
		listaCasadoEHijosOrdenada.put("H", "Hijos");

		listaNacionalidadesOrdenada.put("E", "Española");
		listaNacionalidadesOrdenada.put("F", "Francesa");
		listaNacionalidadesOrdenada.put("I", "Italiana");
		listaNacionalidadesOrdenada.put("P","Portuguesa");
		
		listaDepartamentosOrdenada.put("M", "Marketing");
		listaDepartamentosOrdenada.put("R", "Recursos Humanos");
		listaDepartamentosOrdenada.put("C", "Comercial");
		listaDepartamentosOrdenada.put("F", "Finanzas");
		
		datosFragment.put("primerForm", "Number-1-icon.png");
		datosFragment.put("segundoForm", "Number-2-icon.png");
		datosFragment.put("tercerForm", "Number-3-icon.png");
		datosFragment.put("listado", "checkered-flag-icon.png");
	
		


	}
	
	public static UserListado creaListadoUser(UserPrimerForm uP,UserSegundoForm uS,UserTercerForm uT) {
		
		UserListado uL = new UserListado(
				uP.getNombre(),
				uP.getApellido1(),
				uP.getApellido2(),
				uP.getFechaNac(),
				uP.getSiglaGenero(),
				uP.getEst_Civil_e_Hijos(),
				uP.getNacionalidades(),
				uS.getSiglaDepartamento(),
				uS.getSalario(),
				uS.getComentarios(),
				uT.getCuentaBancaria()
				);
		
		return uL;
	}
	
}
