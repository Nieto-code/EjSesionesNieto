package com.rnieto.sesiones.web.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rnieto.sesiones.web.app.model.Colecciones;
import com.rnieto.sesiones.web.app.model.UserListado;
import com.rnieto.sesiones.web.app.model.UserPrimerForm;
import com.rnieto.sesiones.web.app.model.UserSegundoForm;
import com.rnieto.sesiones.web.app.model.UserTercerForm;

@Controller
@RequestMapping("/sesion")
public class ControladorSesion {
	
	 

	@GetMapping("primerForm")
	public ModelAndView devuelvePrimerFormulario(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		UserPrimerForm primerUser = new UserPrimerForm();

		model.addObject("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
		model.addObject("listaCasadoEHijosOrdenada", Colecciones.listaCasadoEHijosOrdenada);
		model.addObject("listaNacionalidadesOrdenada", Colecciones.listaNacionalidadesOrdenada);

	   
	     //esta comprobacion con los atributos de sesiones para que cargue con ellos en el GET y se añadirian al model
	    if(request.getSession().getAttribute("primerUser") != null) {
	    
	    	primerUser = (UserPrimerForm)request.getSession().getAttribute("primerUser");
	    	
	    }

	  
	
		model.addObject("primerUser", primerUser);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","primerForm");
		model.setViewName("primerForm");

		return model;
	}
	
	

	@PostMapping("primerForm")
	public ModelAndView recogeSegundoFormulario(UserPrimerForm primerUser, HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		ModelAndView model = new ModelAndView();


//		String nombreUser = request.getParameter("nombre");
//		String apellido1User = request.getParameter("primerApellido");
//		String apellido2User = request.getParameter("segundoApellido");
//		String fechaNacUser = request.getParameter("fechaNac");
//		String siglaGeneroUser = request.getParameter("siglaGenero");
//		String est_Civil_e_HijosUser = request.getParameter("est_Civil_e_Hijos");
//		String nacionalidadesUser = request.getParameter("nacionalidades");
//		
//		HttpSession session = request.getSession();
//		
//		session.setAttribute("nombreUser", nombreUser);
//		session.setAttribute("apellido1User", apellido1User);
//		session.setAttribute("apellido2User", apellido2User);
//		session.setAttribute("fechaNacUser", fechaNacUser);
//		session.setAttribute("siglaGeneroUser", siglaGeneroUser);
//		session.setAttribute("est_Civil_e_HijosUser", est_Civil_e_HijosUser);
//		session.setAttribute("nacionalidadesUser", nacionalidadesUser);


		

		request.getSession().setAttribute("primerUser", primerUser);
	
		
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("primerUser",primerUser);
		model.addObject("paso","primerForm");
		

		model.setViewName("redirect:segundoForm");
		return model;
	}

	@GetMapping("segundoForm")
	public ModelAndView devuelveSegundoFormulario(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		UserSegundoForm segundoUser = new UserSegundoForm();
	
	
	      //esta comprobacion con los atributos de sesiones para que cargue con ellos en el GET y se añadirian al model
	    if(request.getSession().getAttribute("segundoUser") != null) {
		    
	    	segundoUser = (UserSegundoForm)request.getSession().getAttribute("segundoUser");
	    	
	    }
		

		
		
		model.addObject("segundoUser", segundoUser);
		model.addObject("listaDepartamentosOrdenada", Colecciones.listaDepartamentosOrdenada);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","segundoForm");

		model.setViewName("segundoForm");

		return model;
	}

	@PostMapping("segundoForm")
	public ModelAndView recogeSegundoFormulario(UserSegundoForm segundoUser, HttpServletRequest request,
			HttpServletResponse response) throws IOException  {

		ModelAndView model = new ModelAndView();


		
//		String siglaDepartamentoUser = request.getParameter("siglaDepartamento");
//		String salarioUser = request.getParameter("salario");
//		String comentariosUser = request.getParameter("comentarios");
//		
//		
//		HttpSession sesion = request.getSession();
//		
//		sesion.setAttribute("siglaDepartamentoUser", siglaDepartamentoUser);
//		sesion.setAttribute("salarioUser", salarioUser);
//		sesion.setAttribute("comentariosUser", comentariosUser);

		request.getSession().setAttribute("segundoUser", segundoUser);
		
	
		model.addObject("segundoUser",segundoUser);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","segundoForm");
		
		model.setViewName("redirect:tercerForm");

		return model;
	}

	@GetMapping("tercerForm")
	public ModelAndView devuelveTercerFormulario(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		UserTercerForm tercerUser = new UserTercerForm();
	

		  //esta comprobacion con los atributos de sesiones para que cargue con ellos en el GET y se añadirian al model
   		 if(request.getSession().getAttribute("tercerUser") != null) {
		    
	    		tercerUser = (UserTercerForm)request.getSession().getAttribute("tercerUser");
	    	
	  	  }

		model.addObject("tercerUser", tercerUser);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","tercerForm");
		
		model.setViewName("tercerForm");

		return model;
	}

	@PostMapping("tercerForm")
	public ModelAndView recogeTercerFormulario(UserTercerForm tercerUser,HttpServletRequest request,
			HttpServletResponse response) throws IOException  {

		ModelAndView model = new ModelAndView();
		
		
//		String cuentaBancariaUser = request.getParameter("cuentaBancaria");
//		
//		HttpSession sesion = request.getSession();
//		
//		sesion.setAttribute("cuentaBancariaUser", cuentaBancariaUser);
		
		request.getSession().setAttribute("tercerUser", tercerUser);
		
		model.addObject("tercerUser",tercerUser);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","tercerForm");
		
		model.setViewName("redirect:listado");

		return model;
	}
	
	
	@GetMapping("listado")
	public ModelAndView devuelveListado(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		UserPrimerForm primerUser = new UserPrimerForm();
		UserSegundoForm segundoUser = new UserSegundoForm();
		UserTercerForm tercerUser = new UserTercerForm();
		
 
		//Comprobar todos los parametros anteriores de la misma forma

		if(request.getSession().getAttribute("primerUser") != null) {
		    
			primerUser = (UserPrimerForm)request.getSession().getAttribute("primerUser");
			System.out.println("Primer nombre" + primerUser.getNombre());
	    }
		
		if(request.getSession().getAttribute("segundoUser") != null) {
		    
			segundoUser = (UserSegundoForm)request.getSession().getAttribute("segundoUser");
			System.out.println( "Salario" + segundoUser.getSalario());
	    }

		if(request.getSession().getAttribute("tercerUser") != null) {
		    
	    	tercerUser = (UserTercerForm)request.getSession().getAttribute("tercerUser");
	    	System.out.println("Primer cuenta" +tercerUser.getCuentaBancaria());
	    }
		
		
		UserListado listadoUser = Colecciones.creaListadoUser(primerUser, segundoUser, tercerUser);
		
	
		System.out.println("Segundo nombre" +listadoUser.getNombre());

		model.addObject("listadoUser",listadoUser);
		model.addObject("datosFragment",Colecciones.datosFragment);
		model.addObject("paso","listado");
		
		model.setViewName("listado");

		return model;
	}
	
	@PostMapping("listado")
	public ModelAndView devuelveInicio(HttpServletRequest request
			) throws IOException  {
		
		ModelAndView model = new ModelAndView();
		
		request.getSession().invalidate();
		
		model.setViewName("redirect:primerForm");

		return model;
	}
	
	

}
