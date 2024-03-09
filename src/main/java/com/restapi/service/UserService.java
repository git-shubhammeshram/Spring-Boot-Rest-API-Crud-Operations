package com.restapi.service;

import java.util.List;

import com.restapi.entity.User;

public interface UserService {
	
	public String upsert(User user);
	public User getUserById(Integer id);
	public List<User> getAllUser();
	public String deleteById(Integer id);
}
