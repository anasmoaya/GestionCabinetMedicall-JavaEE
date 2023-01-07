package com.cabinetmedical.backend.jcabinemedical.Cabinet.Controller;

import com.cabinetmedical.backend.jcabinemedical.Entity.Compte;
import com.cabinetmedical.backend.jcabinemedical.doa.CabinetMedicalDoaImpl;

public class ICompte {
	//Call the Buissnes Interface ICabinet
			CabinetMedicalDoaImpl cmdi= new CabinetMedicalDoaImpl();
	
			public String Authentification(Compte c) {
				String res = "ERROR MESSAGE";
				
				try {
					Compte c2 = cmdi.Find_User(c);	
					res = "WELCOME MESSAGE";
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				return res;
			}		
}
