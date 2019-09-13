package com.iala.cpd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	//@Autowired
	//private EstadoRepository estadoRepository;

	@GetMapping(value = "/")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/home")
	public String home(Model model) {
		return "index";
	}

	@GetMapping(value = "/acessoNegado")
	public String acessoNegado() {
		return "acessoNegado";
	}

}
