package com.cabinetmedical.backend.jcabinemedical.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name="dossierMedical")
public class DM implements Serializable{
	
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dateCreation;
	private String observation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medecin_id")
	private Medecin medecin;
	
	
	public DM(int id, Date dateCreation, String observation) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.observation = observation;
	}
	public DM() {
		super();
	}
	
	
	
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "DM [id=" + id + ", dateCreation=" + dateCreation + ", observation=" + observation + ", patient="
				+ patient + ", medecin=" + medecin + "]";
	}
	
	
	
}
