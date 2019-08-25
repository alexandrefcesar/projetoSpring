package com.ufpb.projeto.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//bean do tipo controller, adicionar a 
//notacao controller para gerenciamento do spring 
@Controller
public class HomeController {
	// metodo que vai abrir a pagina home 
	// vai acessar a raiz do projeto
	@GetMapping("/")
	public String home() {
		return "/home";
	}
}
