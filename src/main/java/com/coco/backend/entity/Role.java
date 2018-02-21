package com.coco.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
<<<<<<< HEAD
@Table(name = "role", uniqueConstraints = @UniqueConstraint(columnNames = { "role_name" }))
=======
@Table(name = "role", uniqueConstraints = @UniqueConstraint(columnNames = { "user" }))
>>>>>>> ca66fed601998c4667cb2323b500f199ffed3110
public class Role {

	@Id
	@Column(name = "cod_Role")
	private Integer codRole;

	@Column(name = "role_name", unique = true, nullable = false)
	private String roleName;

<<<<<<< HEAD
	public Role() {
	}

	public Role(Integer roleID, String roleName) {
=======
	@OneToOne
	private User user;

	public Role() {
	}

	public Role(Integer codRole, String roleName, User user) {
>>>>>>> ca66fed601998c4667cb2323b500f199ffed3110
		super();
		this.codRole = codRole;
		this.roleName = roleName;
		this.user = user;
	}

	public Role(String roleName, User user) {
		super();
		this.roleName = roleName;
		this.user = user;
	}

	public Integer getCodRole() {
		return codRole;
	}

	public void setCodRole(Integer codRole) {
		this.codRole = codRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
