package com.alexaia.app.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReminderController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
		
		
	@GetMapping("/recordatorio")
	public String reminder(Locale locale, Model model) {
		
		return "reminder";
	}

}
