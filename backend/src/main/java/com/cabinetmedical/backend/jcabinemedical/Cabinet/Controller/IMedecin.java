package com.cabinetmedical.backend.jcabinemedical.Cabinet.Controller;

import java.util.List;

import com.cabinetmedical.backend.jcabinemedical.Entity.DM;
import com.cabinetmedical.backend.jcabinemedical.Entity.Patient;
import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;

public class IMedecin extends ICompte{
	String res = "ERROR MESSAGE";
	public String add_dm(DM dm) {	
		cmdi.addDM(dm);
		res = "Added";
		return res;
	}
	
	public DM get_dm(DM dm) {		
		return cmdi.getDM(dm);
	}
	
	
	public String edit_dm(DM dm) {	
		cmdi.editDM(dm);
		res = "Modified";
		return res;
	}
	
	
	public Patient find_patient(Patient p) {	
		return cmdi.findPatient(p.getId());
	}
	
	public List<RDV> List_RDV(){
		return cmdi.all_RDV();
		
	}
	
	public String delete_dm(DM dm) {
		cmdi.deleteDM(dm);	
		res="DELETED";
		return res;
	}
	
	
}
