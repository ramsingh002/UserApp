package com.user.app.model;

import java.util.Date;

public class User {

	private Long userId;
	private String userName;
	private String loginName;
	private String password;
	private Date dob;
	private String email;
	private Long mobile;
	private Date createdDate;
	private Date updatedDate;
	private Boolean status;
	
	public User() {
		super();
	}
	public User(Long userId, String userName, String loginName, String password, Date dob, String email, Long mobile,
			Date createdDate, Date updatedDate, Boolean status) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.loginName = loginName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.status = status;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", loginName=" + loginName + ", password="
				+ password + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", status=" + status + "]";
	}
	
}
