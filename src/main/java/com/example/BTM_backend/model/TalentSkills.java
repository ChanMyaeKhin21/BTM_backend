package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "talentskills")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class TalentSkills implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    private Long talentId;

    @NotNull
    private Long skillId;

    public TalentSkills()
    {

    }
    public TalentSkills(@NotNull Long talentId, @NotBlank Long skillId) {
		super();
		this.talentId = talentId;
		this.skillId = skillId;
	}

    public Long getTalenttId() {
		return talentId;
	}

	public void setTalenttId(Long talentId) {
		this.talentId = talentId;
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