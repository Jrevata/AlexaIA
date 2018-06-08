package com.alexaia.app.controllers;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alexaia.app.models.Evento;
import com.alexaia.app.models.PreEvento;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;



@Controller
public class EditController {
	private static final Logger logger = LoggerFactory.getLogger(EditController.class);
	
	private Integer id_evento;
	
	@GetMapping("/recordatorio/listar/editar")
	public String editar(Locale locale, Model model) {
		
		return "editar";
	}
	
	
	@GetMapping("/recordatorio/listar/editar/{id}")
	public ModelAndView form(@PathVariable Integer id, ModelMap model) {
		Date date = new Date();
		model.addAttribute("dia", date.getDate());
		model.addAttribute("mes", ListController.obtenerMes());
		
		PreEvento preevento = new PreEvento();
		id_evento = id;
		logger.info("id : " + id);
		ModelAndView modelAndView = null;

		try {
			ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
			
			Evento event = api.getEventobyId(id).execute().body();
			
			char[] array = event.getFecha_final().toCharArray();
			
			String fecha = "";
			String hora  = "";
			
			for(int i = 0; i <= 9; i++) {
				fecha = fecha + array[i];
				
			}
			
			for(int i = 11; i < array.length; i++) {
				hora = hora + array[i];
				
			}
			
			model.addAttribute("fecha", fecha);
			model.addAttribute("hora", hora);
			model.addAttribute("evento" , event);
			
			modelAndView = new ModelAndView("editar", "preevento", preevento);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("editar" , "evento", new Evento());
		}

		return modelAndView;
	}
	
	
	
	
	@PostMapping("/recordatorio/listar/editar/editarEvent")
	public ModelAndView editar( @ModelAttribute("preevento")PreEvento preevento , BindingResult result ,ModelMap modelMap) throws IOException {
		logger.info(preevento.toString());
		
		ModelAndView modelAndView = null;
		
		String fecha = preevento.getFecha_fin() + " " + preevento.getHora_fin();
		
		ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
		
		Evento evento = new Evento();
		evento.setId_usuario(LoginController.usuario.getId());
		evento.setFecha_final(fecha);
		evento.setContenido(preevento.getDescripcion());
		evento.setTitulo(preevento.getTitulo());
		evento.setImagen(preevento.getImagen());
		
		Evento ev = api.updateEvento(id_evento, evento).execute().body();
		System.out.println(ev);
		modelAndView = new ModelAndView("redirect:/recordatorio/listar", "command", preevento);
		
		return modelAndView;
		
	}
	
	
	
	
	@GetMapping("/recordatorio/listar/eliminar/{id}")
	public ModelAndView delete(@PathVariable Integer id, ModelMap model) {
		
		
		logger.info("id : " + id);
		ModelAndView modelAndView = null;

		try {
			ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
			
			Evento event = api.deleteEvento(id).execute().body();
			logger.info(event.toString());
			
			
			modelAndView = new ModelAndView("redirect:/recordatorio/listar", "command", event);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("listar" , "evento", new Evento());
		}

		return modelAndView;
	}
	
}
