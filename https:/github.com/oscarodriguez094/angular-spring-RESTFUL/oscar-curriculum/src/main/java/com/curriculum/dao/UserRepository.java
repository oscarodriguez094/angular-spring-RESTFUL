package com.curriculum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);
	List<User> findAll();
	//void deleteUser(Long id);
	User findById(Long id);
}
