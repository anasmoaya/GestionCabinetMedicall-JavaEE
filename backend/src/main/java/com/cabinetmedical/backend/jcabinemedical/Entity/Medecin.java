package com.cabinetmedical.backend.jcabinemedical.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="medecin")
public class Medecin extends Compte implements Serializable{

	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Medecin(int id, String login, String mdp, String fname, String lname, Type type,String CNE) {
		super(id, login, mdp, fname, lname, type,CNE);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Medecin [id=" + id + ", login=" + login + ", mdp=" + mdp + ", fname=" + fname + ", lname=" + lname
				+ "]";
	}
	
	
	
}
