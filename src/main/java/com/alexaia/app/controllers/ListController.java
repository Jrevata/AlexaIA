package com.alexaia.app.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alexaia.app.models.Evento;
import com.alexaia.app.services.ApiServiceAlexa;
import com.alexaia.app.services.ApiServiceGeneratorAlexa;

@Controller
public class ListController {
	
	private static final Logger logger = LoggerFactory.getLogger(ListController.class);
	private List<Evento> eventos2;
	
	
	
	@GetMapping("/recordatorio/listar")
	public String listar(@RequestParam(required = false) Integer page, Locale locale, Model model) {
		Date date = new Date();
		
		
		
		try {
			
			ApiServiceAlexa api = ApiServiceGeneratorAlexa.createService(ApiServiceAlexa.class);
			List<Evento> eventos = api.getEventosbyUser(LoginController.usuario.getId()).execute().body();
			
			/*
			for (int i = 0; i < eventos2.size();i++) {
				if(eventos2.get(i).getEstado()==1)
					eventos.add(eventos.get(i));
			}
			*/
			
			
			
			PagedListHolder<Evento> pagedListHolder = new PagedListHolder<Evento>(eventos);
	        pagedListHolder.setPageSize(5);
	        model.addAttribute("maxPages", pagedListHolder.getPageCount());
			
	        if(page==null || page < 1 || page > pagedListHolder.getPageCount())page=1;
	        	model.addAttribute("page", page);
	        if(page == null || page < 1 || page > pagedListHolder.getPageCount()){
	            pagedListHolder.setPage(0);
	            model.addAttribute("eventos", pagedListHolder.getPageList());
	        }
	        else if(page <= pagedListHolder.getPageCount()) {
	            pagedListHolder.setPage(page-1);
	            model.addAttribute("eventos", pagedListHolder.getPageList());
	        }

	        
	        
	        
			//model.addAttribute("eventos", eventos);
			model.addAttribute("dia", date.getDate());
			model.addAttribute("mes", ListController.obtenerMes());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}
		
		return "listar";
	}
	
	
	public static String obtenerMes() {
		Date date = new Date();
		int mes = date.getMonth();
		String mesVer = null;
		
		switch (mes) {
		case 0:
			mesVer = "Enero";
			break;
		case 1:
			mesVer = "Febrero";
			break;
		case 2:
			mesVer = "Marzo";
			break;
		case 3:
			mesVer = "Abril";
			break;
		case 4:
			mesVer = "Mayo";
			break;
		case 5:
			mesVer = "Junio";
			break;
		case 6:
			mesVer = "Julio";
			break;
		case 7:
			mesVer = "Agosto";
			break;
		case 8:
			mesVer = "Septiembre";
			break;
		case 9:
			mesVer = "Octubre";
			break;
		case 10:
			mesVer = "Noviembre";
			break;
		case 11:
			mesVer = "Diciembre";
			break;
		}
		
		return mesVer;
	}
	
}
