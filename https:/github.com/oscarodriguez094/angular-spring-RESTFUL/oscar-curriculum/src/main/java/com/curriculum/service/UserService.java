package com.curriculum.service;

import java.util.List;

import com.curriculum.model.User;

public interface UserService {

	User save(User user);
	List<User> findAll();
	void deleteUser(Long id);
	User findById(Long id);
}
