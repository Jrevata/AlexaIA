package com.alexaia.app.controllers;

import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alexaia.app.models.Alumno;
import com.alexaia.app.models.Evento;
import com.alexaia.app.models.PreEvento;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;

import okhttp3.internal.http.BridgeInterceptor;


@Controller
public class CreateController {

	private static final Logger logger = LoggerFactory.getLogger(CreateController.class);
	
	/*
	@GetMapping("/recordatorio/crear")
	public String create(Locale locale, Model model) {
		
		return "crear";
	}
	*/
	
	@GetMapping("/recordatorio/crear")
	public ModelAndView createform(ModelMap model) {
		
		PreEvento event = new PreEvento();
		Date date = new Date();
		model.addAttribute("dia", date.getDate());
		model.addAttribute("mes", ListController.obtenerMes());
		ModelAndView modelAndView = new ModelAndView("crear", "preevento", event);

		return modelAndView;
	}
	/*
	@PostMapping("/recordatorio/crearRecor")
	*/
	
	@PostMapping("/recordatorio/crear")
	public ModelAndView crear(@ModelAttribute("preevento")PreEvento preevento , BindingResult result ,ModelMap modelMap) throws IOException, ParseException {
		logger.info(preevento.toString());
	
		ModelAndView modelAndView = null;
		
		String fecha = preevento.getFecha_fin() + " " + preevento.getHora_fin();
		
		ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
		
		Date date = new Date();
		
		String str_date = fecha;
		DateFormat formatter;
		Date date2 = null;
		formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		date2 = formatter.parse(str_date);
		
		
		if(date.after(date2)){
			modelAndView = new ModelAndView("redirect:/recordatorio/crear", "command", preevento);
        }

        if(date.before(date2)){
           
        	Evento ev = api.createEvento(preevento.getTitulo(),LoginController.usuario.getId(), preevento.getDescripcion(), fecha, preevento.getImagen()).execute().body();
    		
    		modelAndView = new ModelAndView("redirect:/recordatorio/listar", "command", preevento);
    		
    		return modelAndView;
        	
        	
        }

        if(date.equals(date2)){
        	modelAndView = new ModelAndView("redirect:/recordatorio/crear", "command", preevento);
        }
		
		return modelAndView;
		
	}
	
	
}
