package com.cabinetmedical.backend.jcabinemedical.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Patient implements Serializable {
	
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	@Column(length = 2,nullable=false)
	private int age;
	@Column(length = 10,nullable=false)
	private String phone;
	@Column(length=50,nullable=false)
	private String fname;
	@Column(length=50,nullable=false)
	private String lname;
	@Column(unique=true,length=10,nullable=false)
	private String CNE;
	@Column(nullable=false)
	private String Email;
	
	
	
	public Patient() {
		super();
	}
	public Patient(int id, int age, String phone, String fname, String lname, String cNE) {
		super();
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.fname = fname;
		this.lname = lname;
		CNE = cNE;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Patient [age=" + age + ", phone=" + phone + ", id=" + id 
				+ ", fname=" + fname + ", lname=" + lname + "]"+CNE;
	}
	
	
	
}
