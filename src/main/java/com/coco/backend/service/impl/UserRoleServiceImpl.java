package com.coco.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coco.backend.entity.User;
import com.coco.backend.repository.UserRepository;
import com.coco.backend.service.UserRoleService;

@Service("userRoleServiceImpl")
public class UserRoleServiceImpl implements UserRoleService {

	/*
	 * Inyectamos los repositorios de las dos entidades
	 */
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
		
	@Override
	public String findUserRoles(int userId) {
		User user = userRepository.findByUserID(userId);
		return user.getRole().getRoleName();
		//Role role = roleRepository.findByRoleID(user.getRole().getRoleID());
		//return role.getRoleName();
	}

	//@Override
	//public Role findRole(int roleId) {
//		return null;
//	}

}
