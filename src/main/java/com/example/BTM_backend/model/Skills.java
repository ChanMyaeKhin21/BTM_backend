package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "skills")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Skills implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

	@NotNull
	private String skill;

    public Skills()
    {

    }
    public Skills(@NotNull String skill) {
		super();
		// this.skillId = skillId;
		this.skill = skill;
	}

    public Long getSkillId() {
		return skillId;
	}

	public void setSillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkill()
	{
		return skill;
	}

	public void setSkill(String skill)
	{
		this.skill = skill;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}