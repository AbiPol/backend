package com.coco.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
<<<<<<< HEAD


@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = { "user_name",
		"password" }))
=======

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = { "userName", "password" }))
>>>>>>> ca66fed601998c4667cb2323b500f199ffed3110
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
	
	@OneToOne
	@JoinColumn(name="role_fk")
	private Role role;

	public User() {
	}

	public User(Integer userID, String userName, String password, boolean activo) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		//this.activo = activo;
	}

	public User(String userName, String password, boolean activo) {
		super();
		this.userName = userName;
		this.password = password;
	//	this.activo = activo;
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

/*	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
*/
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
