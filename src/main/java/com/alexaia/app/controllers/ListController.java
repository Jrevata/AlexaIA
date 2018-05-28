package com.alexaia.app.controllers;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alexaia.app.models.Evento;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;

@Controller
public class ListController {
	
	private static final Logger logger = LoggerFactory.getLogger(ListController.class);
	
	
	@GetMapping("/recordatorio/listar")
	public String listar(Locale locale, Model model) {
		
		
		try {
			
			ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
			List<Evento> eventos = api.getEventos().execute().body();
			
		
			
			
			
			model.addAttribute("eventos", eventos);
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}
		
		return "listar";
	}
	
}
