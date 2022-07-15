package com.user.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.app.model.User;
import com.user.app.service.UserService;

@RestController  
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	public String test() {
		return "RequestMapping Annotation Test.";
	}
	
	@GetMapping
	public List<User> findAll(){
		System.out.println("CONTROLLER : UserController : findAll...!!!");
		return userService.findAll();
	}
	
	@GetMapping("/{userId}")
	public User findByUserId(@PathVariable("userId") Long userId) {
		System.out.println("CONTROLLER : UserController : findByUserId : USER-ID : "+userId);
		return userService.findByUserId(userId);
	}
	
	@GetMapping("/find-by-login-name/{loginName}")
	public User findByLoginName(@PathVariable("loginName") String loginName) {
		System.out.println("CONTROLLER : UserController : findByLoginName : Login-Name : "+loginName);
		return userService.findByLoginName(loginName);
	}
	
	@GetMapping("/find-by-email/{email}")
	public User findByEmail(@PathVariable("email") String email) {
		System.out.println("CONTROLLER : UserController : findByEmail : Email : "+email);
		return userService.findByEmail(email);
	}
	
	@GetMapping("/find-by-mobile/{mobile}")
	public User findByMobile(@PathVariable("mobile") Long mobile) {
		System.out.println("CONTROLLER : UserController : findByMobile : Mobile : "+mobile);
		return userService.findByMobile(mobile);
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		System.out.println("CONTROLLER : UserController : addUser...!!!");
		return userService.addUser(user);
	}
	
	@PutMapping
	public String updateUser(@RequestParam("userId") Long userId, @RequestBody User user) {
		System.out.println("CONTROLLER : UserController : updateUser : USER-ID : "+userId);
		return userService.updateUser(userId, user);
	}
	
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable("userId") Long userId) {
		System.out.println("CONTROLLER : UserController : deleteUser : USER-ID : "+userId);
		return userService.deleteUser(userId);
	}
}
