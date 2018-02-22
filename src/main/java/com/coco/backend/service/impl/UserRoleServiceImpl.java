package com.coco.backend.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coco.backend.controller.NameRoleRestController;
import com.coco.backend.entity.User;
import com.coco.backend.repository.UserRepository;
import com.coco.backend.service.UserRoleService;

@Service("userRoleServiceImpl")
public class UserRoleServiceImpl implements UserRoleService {

	private Log LOG = LogFactory.getLog(UserRoleServiceImpl.class);
	/*
	 * Inyectamos los repositorios de las dos entidades
	 */
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Override
	public String findUserRoles(int userId) {
		
		//String userRole;
		User user = userRepository.findByUserID(userId);
		return user.getRole();
		//Role role = roleRepository.findByRoleID(user.getRole().getRoleID());
		//return role.getRoleName();
	}
	
	public User findUser(int userId) {
		User user = userRepository.findByUserID(userId);
		//User user_aux =  userRepository.findByUserID(userId);
		//LOG.info("--- user_aux: " + user_aux + "----");
		return user;
	}



	//@Override
	//public Role findRole(int roleId) {
//		return null;
//	}

}
