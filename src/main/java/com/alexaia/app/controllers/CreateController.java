package com.alexaia.app.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@GetMapping("/recordatorio/crear")
	public String create(Locale locale, Model model) {
		
		return "crear";
	}
	
}
