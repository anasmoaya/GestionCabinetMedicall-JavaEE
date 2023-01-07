package com.cabinetmedical.backend.jcabinemedical.doa;

import java.util.List;

import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;
import com.cabinetmedical.backend.jcabinemedical.Entity.*;

public interface ICabinetMedical {
	
	public void addRdv(RDV rdv);//Assistant
	public void deleteRdv(RDV rdv);//Assistant
	public void editRdv(RDV rdv);//Assistant
	public RDV findRdv(int rdv);//Assistant Patient Medecin
	public List<RDV> all_RDV();//Assistant Medecin
	public void CancelRdv(RDV rdv);//Assistant Patient
	public void ConfirmRdv(RDV rdv);//Assistant Patient
	public void NotConfirmRdv(RDV rdv);//Assistant Patient
	public void defaultCancel(RDV rdv);//AUTO
	
	public void addDM(DM dm);//Medecin
	public void deleteDM(DM dm);//Medecin
	public void editDM(DM dm);//Medecin
	public DM getDM(DM dm);//Medecin Patient
	public DM getDMByPatientid(int p);
	
	public void addPatient(Patient p);//Patient
	public Patient findPatient(int p);//Medecin
	public List<Patient> findPatientByName(String name);//Medecin Assistant
	public List<Patient> all_Patient();//Medecin Assistant 
	
	
	public void addMedecin(Medecin m);//Admin
	
	
	public void addAssistant(Assistant a);//Admin
	
	
	public Compte Find_User(Compte c);
	
	
	public long total_rdv();
	public long total_patient();
	public long total_revenu();
	
	
}
