package com.cabinetmedical.backend.jcabinemedical.Cabinet.Controller;

import java.util.ArrayList;
import java.util.List;

import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;

public class IAssistant extends ICompte{
	
	
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
	
	
	public String cancel_rdv(RDV rdv) {
		String res ="ERROR MESSAGE";
		try {
			cmdi.CancelRdv(rdv);
			res = "RDV CANCELED";
		}catch(Exception e) {
			e.printStackTrace();
		}

		return res;
	}
	
	public String edit_rdv(RDV rdv) {
		String res = "ERROR MESSAGE";
		try {
			cmdi.editRdv(rdv);
			res="RDV EDITED";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	public RDV find_RDV(RDV rdv) {
		RDV rdv_found=null;
		
		try {
			rdv_found = cmdi.findRdv(rdv.getRid());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return rdv_found;
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
