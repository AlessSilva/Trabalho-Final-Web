package com.restaurant.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{

	@Id
	private String papel;
	
	@ManyToMany( mappedBy = "roles" )
	private List<Cliente> clientes;
	
	@Override
	public String getAuthority() {
		return this.papel;
	}

}
