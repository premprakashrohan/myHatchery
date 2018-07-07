package com.ski.hatchery.service;

import java.util.ArrayList;
import java.util.List;

import com.ski.hatchery.model.Role;
import com.ski.hatchery.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void createUser(User user);
	public List<User> findAll();
	public List<Role> findAllRoles();
}
