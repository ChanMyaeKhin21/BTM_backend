package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "experts")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Experts implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@NotNull
    private Long expertId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String password;

	@NotNull
	private String invitationCode;

    

    public Experts()
    {

    }
    public Experts(@NotNull Long expertId, @NotBlank String firstName, @NotBlank String surname, @NotBlank String password, @NotNull String invitationCode) {
		super();
		this.expertId = expertId;
		this.firstName = firstName;
		this.surname = surname;
		this.invitationCode = invitationCode;
	}

    public Long getExpertId() {
		return expertId;
	}

	public void setExpertId(Long expertId) {
		this.expertId = expertId;
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

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}