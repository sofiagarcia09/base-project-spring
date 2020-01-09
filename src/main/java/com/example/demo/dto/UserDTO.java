package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import com.example.demo.models.Rol;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDTO {
	

	private Long id;	
	private String name;	
	private String lastname;	
	private Boolean status;	
	private Date createDatabase;
	private List<Rol> roles;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getCreateDatabase() {
		return createDatabase;
	}
	public void setCreateDatabase(Date date) {
		this.createDatabase = date;
	}
	//@JsonIgnore
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	
}
