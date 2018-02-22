package com.coco.backend.service;

import com.coco.backend.entity.User;

public interface UserRoleService {

	public abstract String findUserRoles(int userId);
	
	public User findUser(int userId);
}
