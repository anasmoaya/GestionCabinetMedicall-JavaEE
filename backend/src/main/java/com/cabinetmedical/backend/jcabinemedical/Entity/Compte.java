package com.cabinetmedical.backend.jcabinemedical.Entity;

import jakarta.persistence.*;

import java.io.Serializable;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	@Column(unique=true,length=10,nullable=false)
	protected String CNE;
	@Column(length=50,nullable=false)
	protected String login;
	@Column(length=150,nullable=false)
	protected String mdp;
	@Column(length=50,nullable=false)
	protected String fname;
	@Column(length=50,nullable=false)
	protected String lname;
	@Enumerated(EnumType.STRING)
	private Type type;
	

	public Compte() {
		super();
	}
	public Compte(int id, String login, String mdp, String fname, String lname,Type type,String CNE) {
		super();
		this.id = id;
		this.login = login;
		this.mdp = mdp;
		this.fname = fname;
		this.lname = lname;
		this.type=type;
		this.CNE=CNE;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	
	
	
}
