package com.coco.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "fk_user", "fk_role" }))
public class UserRole {

	@Id
	@Column(name = "id_user_role", unique = true, nullable = false)
	private Integer idUserRole;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user", nullable = false)
	private User fkUser;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_role", nullable = false)
	private Role fkRole;

	public UserRole() {
	}

	public UserRole(Integer idUserRole, User fkUser, Role fkRole) {
		super();
		this.idUserRole = idUserRole;
		this.fkUser = fkUser;
		this.fkRole = fkRole;
	}

	public UserRole(User fkUser, Role fkRole) {
		super();
		this.fkUser = fkUser;
		this.fkRole = fkRole;
	}

	public Integer getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(Integer idUserRole) {
		this.idUserRole = idUserRole;
	}

	public User getFkUser() {
		return fkUser;
	}

	public void setFkUser(User fkUser) {
		this.fkUser = fkUser;
	}

	public Role getFkRole() {
		return fkRole;
	}

	public void setFkRole(Role fkRole) {
		this.fkRole = fkRole;
	}

}
