package com.filipe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//metodo que será chamado como resposta a solicitação localhost:8080/
	@GetMapping("/") 
	public String home() {	
		return "/home.html";
	}
	
	
}
