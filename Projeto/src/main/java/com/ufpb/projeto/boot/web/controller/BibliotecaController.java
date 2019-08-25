package com.ufpb.projeto.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/biblioteca")
public class BibliotecaController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/biblioteca/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/biblioteca/lista";
	}

}
