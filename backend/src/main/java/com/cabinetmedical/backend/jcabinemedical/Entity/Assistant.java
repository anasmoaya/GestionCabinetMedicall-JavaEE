package com.cabinetmedical.backend.jcabinemedical.Entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="assistant")

public class Assistant extends Compte implements Serializable{

	public Assistant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assistant(int id, String login, String mdp, String fname, String lname, Type type,String CNE) {
		super(id, login, mdp, fname, lname, type,CNE);
		// TODO Auto-generated constructor stub
	}

	

}
