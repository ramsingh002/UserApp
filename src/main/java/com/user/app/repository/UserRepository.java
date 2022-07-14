package com.user.app.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.user.app.model.User;

@Component
public class UserRepository {
	
	private static List<User> userList = new ArrayList<User>();
	
	static {
		userList.add(new User(1L, "Ram Singh", "ramsingh", "Ram@12345", new Date(), "ram.singh002@yahoo.com", 9887123638L, new Date(), new Date(), true));
		userList.add(new User(2L, "Kiran Saini", "kiran", "Krn@67890", new Date(), "kiransaini@gmail.com", 8608549414L, new Date(), new Date(), true));
		userList.add(new User(3L, "Mamta Mitawa", "mamta.m", "Mamta@135", new Date(), "mamta.m@gmail.com", 9887876388L, new Date(), new Date(), true));
	}
	
	public List<User> findAll(){	
		System.out.println("REPOSITORY : UserRepository : findAll...!!!");
		return userList;
	}
	
	public User findByUserId(Long userId) {
		System.out.println("REPOSITORY : UserRepository : findByUserId : User-Id : "+userId);
		return userList.stream().filter(usr -> usr.getUserId() == userId).findFirst().orElse(null);
	}
	
	public User findByLoginName(String loginName) {
		System.out.println("REPOSITORY : UserRepository : findByLoginName : Login-Name : "+loginName);
		return userList.stream().filter(usr -> usr.getLoginName().equalsIgnoreCase(loginName)).findFirst().orElse(null);
	}
	
	public User findByEmail(String email) {
		System.out.println("REPOSITORY : UserRepository : findByEmail : Email : "+email);
		return userList.stream().filter(usr -> usr.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
	}
	
	public User findByMobile(Long mobile) {
		System.out.println("REPOSITORY : UserRepository : findByMobile : Mobile : "+mobile);
		return userList.stream().filter(usr -> usr.getMobile() == mobile).findFirst().orElse(null);
	}
	
	public User addUser(User user) {
		System.out.println("REPOSITORY : UserRepository : addUser...!!!");
		userList.add(user);
		return user;
	}
	
	public String updateUser(Long userId, User user) {
		System.out.println("REPOSITORY : UserRepository : updateUser...!!!");
		User updateUser = userList.stream().filter(usr -> usr.getUserId() == userId).findFirst().orElse(null);
		if(updateUser != null) {
			updateUser.setUserName(user.getUserName());
			updateUser.setDob(user.getDob());
			updateUser.setEmail(user.getEmail());
			updateUser.setMobile(user.getMobile());
			updateUser.setUpdatedDate(new Date());
			return "User Updated Successfully For UserID : "+userId;
		}		
		return "User Not Found For UserID : "+userId;
	}
	
	public String deleteUser(Long userId) {
		System.out.println("REPOSITORY : UserRepository : deleteUser : User-Id : "+userId);
		User user = userList.stream().filter(usr -> usr.getUserId() == userId).findFirst().orElse(null);
		if(user != null) {
			userList.remove(user);
			return "User Deleted For UserID : "+userId;
		}		
		return "User Not Found For UserID : "+userId;
	}
}
