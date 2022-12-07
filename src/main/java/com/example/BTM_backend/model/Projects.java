package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "projects")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Projects implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@NotNull
    private Long projectId;

	@NotNull
    private Long clientId;

    @NotNull
    private Long skillId;

    @NotNull
    private String service;

    

    public Projects()
    {

    }
    public Projects(@NotNull Long projectId, @NotNull Long clientId, @NotNull Long skillId, @NotNull String service) {
		super();
		this.projectId = projectId;
		this.clientId = clientId;
		this.skillId = skillId;
		this.service = service;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
    public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}