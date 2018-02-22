package com.coco.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = { "user_Name", "password" }))

public class User {

	@Id
	@GeneratedValue
	private Integer userID;

	@Column(name = "user_name", nullable = false, unique = true)
	private String userName;

	@Column(name = "password", nullable = false, length = 60)
	private String password;

	//@Column(name = "activo", nullable = true)
	//private boolean activo;
	
	//@OneToOne
	//@JoinColumn(name="role_fk")
	@Column(name = "role", nullable = false, length = 60)
	private String role;

	public User() {
	}
	
	public User(Integer userID, String userName, String password, String role) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}


	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
	