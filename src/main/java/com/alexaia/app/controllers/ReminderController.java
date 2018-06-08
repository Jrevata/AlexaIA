package com.alexaia.app.controllers;

import java.io.IOException;
import java.util.Date;
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
public class ReminderController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReminderController.class);
		
		
	@GetMapping("/recordatorio")
	public String reminder(Locale locale, Model model) throws IOException {
		Date date = new Date();
		model.addAttribute("dia", date.getDate());
		model.addAttribute("mes", ListController.obtenerMes());
		
		
		return "reminder";
	}

}
