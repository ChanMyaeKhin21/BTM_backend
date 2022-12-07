package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "talents")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Talents implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@NotNull
    private Long talentId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String password;

	@NotNull
    private Long academicYear;

    @NotNull
    private String programme;

    @NotNull
    private String studentLevel;

    @NotNull
    private String studentStatus;

	@NotNull
    private boolean jobShop;
    
	@NotNull
    private Long recommendation;

    public Talents()
    {

    }
    public Talents(@NotNull Long talentId, @NotNull String firstName, @NotNull String surname, @NotNull String password,
			@NotNull Long academicYear, @NotNull String programme, @NotNull String studentLevel, @NotNull String studentStatus,
            @NotNull boolean jobShop, @NotNull Long recommendation) {
		super();
		this.talentId = talentId;
		this.firstName = firstName;
		this.surname = surname;
		this.password = password;
        this.academicYear = academicYear;
        this.programme = programme;
        this.studentLevel = studentLevel;
        this.studentStatus = studentStatus;
        this.jobShop = jobShop;
        this.recommendation = recommendation;
	}

    public Long getTalentId() {
		return talentId;
	}

	public void setTalentId(Long talentId) {
		this.talentId = talentId;
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

    public Long getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Long academicYear) {
		this.academicYear = academicYear;
	}

    public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

    public String getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}

    public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

    public boolean getJobShop() {
		return jobShop;
	}

	public void setJobShop(Boolean jobShop) {
		this.jobShop = jobShop;
	}

    public Long getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Long recommendation) {
		this.recommendation = recommendation;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}