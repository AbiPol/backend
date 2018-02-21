package com.coco.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coco.backend.model.UserModel;

@Controller
public class LoginController {

	private static final Log LOG = LogFactory.getLog(LoginController.class);
	private String retorno;
	
	@GetMapping("/")
	public String redirectLogin() {
		LOG.info("METODO: redirectLogin()");
		return "redirect:/login";
	}
	
	@GetMapping("")
	public String redirectLoginB() {
		LOG.info("METODO: redirectLoginB()");
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String mostrarLogin(Model model,
			                   @RequestParam(name="retorno", required=false) String retorno) {
		LOG.info("retorno = " + retorno + "--");
		if(retorno == null){
			
			retorno = "OK";
		}
		LOG.info("retorno = " + retorno + "-- depues --");
		model.addAttribute("retorno", retorno);
		model.addAttribute("datosuser", new UserModel());
		return "login";
	}
	
	@PostMapping("/checkin")
	public String loginCheck(@ModelAttribute(name="datosuser") UserModel userModel) {
		LOG.info("Nombre usuario: " + userModel.getUsername());
		LOG.info("Password usuario: " + userModel.getPassword());
		retorno = "OK";
		
		return "redirect:/login?" + retorno;
	}
}
