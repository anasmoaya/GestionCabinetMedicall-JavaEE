package com.cabinetmedical.backend.jcabinemedical.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class RDV implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
    private Date RdvDate;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date StartRdv;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date FinishRdv;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Status status;	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="assistant_id")
	private Assistant assistant;

	
	

	public RDV(int rid, Date rdvDate, Date startRdv, Date finishRdv, Status status, Patient patient,
			Assistant assistant) {
		super();
		this.rid = rid;
		RdvDate = rdvDate;
		StartRdv = startRdv;
		FinishRdv = finishRdv;
		this.status = status;
		this.patient = patient;
		this.assistant = assistant;
	}


	public RDV() {
		super();
	}


	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Date getRdvDate() {
		return RdvDate;
	}

	public void setRdvDate(Date rdvDate) {
		RdvDate = rdvDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Assistant getAssistant() {
		return assistant;
	}

	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Date getStartRdv() {
		return StartRdv;
	}


	public void setStartRdv(Date startRdv) {
		StartRdv = startRdv;
	}


	public Date getFinishRdv() {
		return FinishRdv;
	}


	public void setFinishRdv(Date finishRdv) {
		FinishRdv = finishRdv;
	}
	
	
	
	
}
