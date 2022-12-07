package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "clients")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Clients implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@NotNull
    private Long clientId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String email;

    

    public Clients()
    {

    }
    public Clients(@NotNull Long clientId, @NotNull String firstName, @NotNull String surname, @NotNull String email) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
	}

    public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}