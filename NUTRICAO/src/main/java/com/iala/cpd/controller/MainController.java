package com.iala.cpd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import com.iala.cpd.repository.EstadoRepository;;

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
		//Organizacao org = organizacaoRepository.findAll(2).get(0);
		//OrganizacaoModel orgMod = new OrganizacaoModel(org);
		//Long ufId = org.getLocalidade().getEstado().getId();
		//model.addAttribute("Organizacao", orgMod);
		//model.addAttribute("Estados", estadoRepository.findAllByPais("Brasil"));
		//model.addAttribute("Municipios", localidadeRepository.findByUfId(ufId));
		return "index";
	}


	//@GetMapping(value = "/administracao")
	//public String administracao() {
	//	return "administracao";
	//}

	//@GetMapping(value = "/anoletivo")
	//public String anoLetivo() {
	//	return "ano_letivo";
	//}

	@GetMapping(value = "/acessoNegado")
	public String acessoNegado() {
		return "acessoNegado";
	}

}
