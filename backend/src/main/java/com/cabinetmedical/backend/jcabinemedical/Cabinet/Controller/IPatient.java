package com.cabinetmedical.backend.jcabinemedical.Cabinet.Controller;


import com.cabinetmedical.backend.jcabinemedical.Entity.DM;
import com.cabinetmedical.backend.jcabinemedical.Entity.Patient;
import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;
import com.cabinetmedical.backend.jcabinemedical.doa.CabinetMedicalDoaImpl;


public class IPatient{
	
	CabinetMedicalDoaImpl cmdi= new CabinetMedicalDoaImpl();
	String res;
	//Add Patient Controller AKA CREATE PATIENT ACCOUNT
	public String addPatient(Patient p) {
		cmdi.addPatient(p);
		res="Patient Added";
		return res;
	}
    
	
	public DM get_DM(Patient p) {
		DM dm;
		dm = cmdi.getDMByPatientid(p.getId());
		return dm;
	}
    
	
	public String take_RDV(RDV rdv) {
		String res ="ERROR MESSAGE";
		try {
			cmdi.addRdv(rdv);
			res = "RDV ADDED";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return res;
	}
	
	
	public String confirm_rdv(RDV rdv) {
		res ="ERROR MESSAGE";
		
		
		try {
			cmdi.ConfirmRdv(rdv);
			res = "MESSAGE SENT";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	public String noconfirm_rdv(RDV rdv) {
		res ="ERROR MESSAGE";
		
		
		try {
			cmdi.NotConfirmRdv(rdv);
			res = "MESSAGE SENT";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	
	
    
}
