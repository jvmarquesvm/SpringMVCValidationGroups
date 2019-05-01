package com.padrao.spring.entities;

import org.hibernate.validator.constraints.NotEmpty;

public class Account {

	@NotEmpty(groups = {Group1.class, Group2.class})
	private String username;
	
	@NotEmpty(groups = {Group1.class})
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
