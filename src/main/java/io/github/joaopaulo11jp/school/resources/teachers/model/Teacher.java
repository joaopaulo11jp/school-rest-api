package io.github.joaopaulo11jp.school.resources.teachers.model;

import java.time.LocalDate;
import java.util.UUID;

public class Teacher {

	private UUID id;
	
	private String name;
	
	private LocalDate birthDate;
	
	private String nationalId;
	
	private String phoneNumber;
	
	private String email;
	
	
	public Teacher(UUID id, String name, LocalDate birthDate, String nationalId, String phoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.nationalId = nationalId;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Teacher() {}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
