package com.scpractise.task.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue
	@Column(name="uid")
	private int uid;
	@Column(name="username")
	private String username;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(int uid, String username) {
		super();
		this.uid = uid;
		this.username = username;
	}
	public User() {
		super();
	}
	
	
   
	
	
	
}
