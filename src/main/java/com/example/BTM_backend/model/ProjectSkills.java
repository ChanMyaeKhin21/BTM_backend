package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "projectskills")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class ProjectSkills implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    private Long projectId;

    @NotNull
    private Long skillId;

    public ProjectSkills()
    {

    }
    public ProjectSkills(@NotNull Long projectId, @NotBlank Long skillId) {
		super();
		this.projectId = projectId;
		this.skillId = skillId;
	}

    public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

    public Long getSkillId() {
		return skillId;
	}

	public void setSillId(Long skillId) {
		this.skillId = skillId;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}