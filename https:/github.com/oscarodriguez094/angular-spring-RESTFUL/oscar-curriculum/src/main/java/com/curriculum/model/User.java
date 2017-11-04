package com.curriculum.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Access(AccessType.FIELD)
public class User extends ParentEntity {

	private static final long serialVersionUID = 8435405591663518471L;

	@Column(name = "first_name", nullable = false, length = 255)
	private String firstName;

	@Column(name = "second_name", nullable = true, length = 255)
	private String secondName;

	@Column(name = "first_surname", nullable = false, length = 255)
	private String firstSurname;

	@Column(name = "second_surname", nullable = true, length = 255)
	private String secondSurname;

	@Column(name = "phone", nullable = true, length = 30)
	private Integer phone;

	@Column(name = "address", nullable = false, length = 150)
	private String address;
	
	@Column(name = "birthdate", nullable = true)
	private String birthdate;
	
	@Column(name = "photo_url", nullable = false, length = 255)
	private String photoUrl;
	
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "postal_code", nullable = false, length = 255)
	private String postaCode;
	
	@Column(name = "province", nullable = false, length = 255)
	private String province;
	
	@Column(name = "experience_id", nullable = false, length = 10)
	private Integer experienceId;
	
	@Column(name = "qualities_id", nullable = false, length = 10)
	private Integer qualitiesId;
	
	
	
	public Integer getQualitiesId() {
		return qualitiesId;
	}

	public void setQualitiesId(Integer qualitiesId) {
		this.qualitiesId = qualitiesId;
	}
	
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	public Integer getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public String getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(String postaCode) {
		this.postaCode = postaCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
