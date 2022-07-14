package com.user.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.app.model.User;
import com.user.app.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		System.out.println("SERVICE : UserService : findAll...!!!");
		return userRepository.findAll();
	}
	
	public User findByUserId(Long userId) {
		System.out.println("SERVICE : UserService : findByUserId : User-Id : "+userId);
		return userRepository.findByUserId(userId);
	}
	
	public User findByLoginName(String loginName) {
		System.out.println("SERVICE : UserService : findByLoginName : Login-Name : "+loginName);
		return userRepository.findByLoginName(loginName);
	}
	
	public User findByEmail(String email) {
		System.out.println("SERVICE : UserService : findByEmail : Email : "+email);
		return userRepository.findByEmail(email);
	}
	
	public User findByMobile(Long mobile) {
		System.out.println("SERVICE : UserService : findByMobile : Mobile : "+mobile);
		return userRepository.findByMobile(mobile);
	}
	
	public User addUser(User user) {
		System.out.println("SERVICE : UserService : addUser...!!!");
		return userRepository.addUser(user);
	}
	
	
	public String updateUser(Long userId, User user) {
		System.out.println("SERVICE : UserService : updateUser...!!!");
		return userRepository.updateUser(userId, user);
	}
	
	public String deleteUser(Long userId) {
		System.out.println("SERVICE : UserService : deleteUser : User-Id : "+userId);
		return userRepository.deleteUser(userId);
	}
	
}
