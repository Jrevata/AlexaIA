package com.alexaia.app.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.alexaia.app.HomeController;
import com.alexaia.app.models.Alumno;
import com.alexaia.app.models.Login;
import com.alexaia.app.services.ApiService;
import com.alexaia.app.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	public static Alumno alumno_autenticado;
	
	@GetMapping({"/","/login"})
	public String home(Locale locale, Model model) {
		
		return "login";
	}
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("SpringWeb") Login login, ModelMap model) {
		alumno_autenticado = null;
		logger.info("login()");
		logger.info(login.toString());
		ModelAndView modelAndView = null;
		Login log=null;
		Alumno al;
		
		al=validate(login.getUsuario(), login.getClave());
		if (al != null) {
			logger.info(login.toString());
			modelAndView = new ModelAndView("redirect:/home", "command", login);
		}else {
			model.addAttribute("login", "Usuario y/o clave incorrectos");
			modelAndView = new ModelAndView("login", "command", new Login());
		}
		return modelAndView;
	}
	
	
	
	
	
	public Alumno validate(String usuario, String password) {
		ApiService api = ApiServiceGenerator.createService(ApiService.class);
		
		
		
		try {
			alumno_autenticado = api.login(usuario, password).execute().body();
		} catch (IOException e) {
			logger.error(e.toString(), e);
			e.printStackTrace();
		}
		
		
		
		return alumno_autenticado;
	}
}
