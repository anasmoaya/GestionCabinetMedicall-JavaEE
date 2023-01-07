package com.cabinetmedical.backend.jcabinemedical.Cabinet.Controller;


import java.util.ArrayList;
import java.util.List;

import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;
import com.cabinetmedical.backend.jcabinemedical.doa.CabinetMedicalDoaImpl;

public class IHome {
	CabinetMedicalDoaImpl cmdi= new CabinetMedicalDoaImpl();
	String res="ERROR MESSAGE";
	
	public String revenu() {	
		return cmdi.total_revenu()+" DH";	
	}
	public long patient() {	
		return cmdi.total_patient();	
	}
	public long rdv() {	
		return cmdi.total_rdv();	
	}
	public List<RDV> List_RDV(){
		List<RDV> list = new ArrayList<RDV>();
		
		try {
			list = cmdi.all_RDV();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
		
	}
}
