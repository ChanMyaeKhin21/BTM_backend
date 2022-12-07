package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "expertskills")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class ExpertSkills implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    private Long expertId;

    @NotNull
    private Long skillId;

    public ExpertSkills()
    {

    }
    public ExpertSkills(@NotNull Long expertId, @NotBlank Long skillId) {
		super();
		this.expertId = expertId;
		this.skillId = skillId;
	}

    public Long getExpertId() {
		return expertId;
	}

	public void setExpertId(Long expertId) {
		this.expertId = expertId;
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