package com.jsp.ecommerce.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@CreationTimestamp
	private LocalDateTime createdTime;
	

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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDateTime getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	// Explicit getter for password to support IDEs without Lombok processing
	public String getPassword() {
		return this.password;
	}
}
