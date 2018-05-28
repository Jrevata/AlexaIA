package com.alexaia.app.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alexaia.app.models.Evento;


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
	public ModelAndView createform() {

		Evento event = new Evento();

		ModelAndView modelAndView = new ModelAndView("crear", "evento", event);

		return modelAndView;
	}
	/*
	@PostMapping("/recordatorio/crearRecor")
	*/
}
