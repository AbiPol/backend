package com.coco.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coco.backend.entity.User;
import com.coco.backend.service.impl.UserRoleServiceImpl;

@RestController
@RequestMapping("/rest")

public class NameRoleRestController {
	
	private Log LOG = LogFactory.getLog(NameRoleRestController.class);
	
	@Autowired
	@Qualifier("userRoleServiceImpl")
	private UserRoleServiceImpl userRoleServiceImpl;
	
	@GetMapping("/consulta")
	public ResponseEntity<String> roleUser (){
		LOG.info("Entramos en el controller");
		int userId = 3;
		String nameUser;
		
		LOG.info("ID de susario: -- " + userId + " --");
		nameUser = userRoleServiceImpl.findUserRoles(userId);
		LOG.info("nombre de usuario: -- " + nameUser + " --");
		
		return new ResponseEntity<String>(nameUser, HttpStatus.OK);
	}
	
	@GetMapping("/consultaUser")
	public ResponseEntity<User> user (){
		LOG.info("Entramos en el controller User");
		int userId = 3;
		User user;
		
		LOG.info("ID de susario: -- " + userId + " --");
		user = userRoleServiceImpl.findUser(userId);
		LOG.info("nombre de usuario: -- " + user + " --");
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
