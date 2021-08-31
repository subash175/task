package com.scpractise.task.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parametres {

	@Id
	private int code;
	
    private String description;
	
	private String value;
	
	private int unit;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getunit() {
		return unit;
	}

	public void setunit(int unit) {
		this.unit = unit;
	}

	public Parametres(int code, String description, String value, int unit) {
		super();
		this.code = code;
		this.description = description;
		this.value = value;
		this.unit = unit;
	}

	public Parametres() {
		super();
	}
	
	
	
}
