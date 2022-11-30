package com.example.BTM_backend.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "talent")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Talents implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private Long talentId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String surname;

    @NotBlank
    private String password;

    @NotBlank
    private int academicYear;

    @NotBlank
    private String programme;

    @NotBlank
    private String studentLevel;

    @NotBlank
    private String studentStatus;

    @NotBlank
    private boolean jobShop;
    
    @NotBlank
    private int recommendation;

    public Talents()
    {

    }
    public Talents(@NotBlank Long talentId, @NotBlank String firstName, @NotBlank String surname, @NotBlank String password,
			@NotBlank int academicYear, @NotBlank String programme, @NotBlank String studentLevel, @NotBlank String studentStatus,
            @NotBlank boolean jobShop, @NotBlank int recommendation) {
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

    public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Integer academicYear) {
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

    public int getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
}