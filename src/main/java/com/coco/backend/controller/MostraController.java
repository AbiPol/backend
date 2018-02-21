package com.coco.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mostrar")
public class MostraController {

	private Log LOG = LogFactory.getLog(MostraController.class);
	
	@GetMapping("/urlrest")
	public String mostrarContacForm() {
		LOG.info("Mostramos el contactform");
		return "enviorest";
	}
}
