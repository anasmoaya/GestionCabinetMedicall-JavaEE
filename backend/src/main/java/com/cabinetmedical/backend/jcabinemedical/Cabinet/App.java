package com.cabinetmedical.backend.jcabinemedical.Cabinet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    	
    	Date datetime=new Date();

    	System.out.println(datetime.getHours());
    	System.out.println(datetime.getMinutes());


//        System.out.println("It Works !");
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Cabinet");
//        EntityManager em = emf.createEntityManager();
//        
//        em.close();
//        emf.close();
//    	
//    	Assistant assistant = new Assistant();
//    	
//    	assistant.setLogin("Assistant1");
//    	assistant.setMdp("123456");
//    	assistant.setCNE("TEST");
//    	assistant.setFname("Adil");
//    	assistant.setLname("Chbaly");
//    	assistant.setType(Type.ASSISTANT);
//    	
//    	
//    	Patient person = new Patient();
//    	person.setCNE("EE123645");
//    	person.setEmail("Test@gmail.com");
//    	person.setFname("Adil");
//    	person.setLname("Chbaly");
//    	person.setAge(22);
//    	person.setPhone("0641841987");
//    	
//    	Patient person2 = new Patient();
//    	person2.setCNE("EE5205251");
//    	person2.setEmail("Test2@gmail.com");
//    	person2.setFname("Adil");
//    	person2.setLname("Chbaly");
//    	person2.setAge(22);
//    	person2.setPhone("0641841987");
//    	
//  
//    	Date datetime = new Date();
//    	
//    	
//    	RDV rdv=new RDV();
//    	rdv.setRdvDate(datetime);
//    	rdv.setPatient(person);
//    	rdv.setFinishRdv(datetime);
//    	rdv.setStartRdv(datetime);
//    	rdv.setAssistant(assistant);  
//    	rdv.setStatus(Status.PENDING);
//    	
//    	RDV rdv2=new RDV();
//    	rdv2.setRdvDate(datetime);
//    	rdv2.setPatient(person2);
//    	rdv2.setFinishRdv(datetime);
//    	rdv2.setStartRdv(datetime);
//    	rdv2.setAssistant(assistant);  
//    	rdv2.setStatus(Status.PENDING);
//    	
//    	
//    	Medecin medecin = new Medecin();
//    	medecin.setLogin("medecin1");
//    	medecin.setMdp("123456");
//    	medecin.setCNE("EE52052");
//    	medecin.setFname("Houssam");
//    	medecin.setLname("Eddine Neass");
//    	medecin.setType(Type.MEDECIN);
//    	
//    	
//    	DM dm = new DM();
//    	dm.setObservation("Mrid1");
//    	dm.setDateCreation(datetime);
//    	dm.setMedecin(medecin);
//    	dm.setPatient(person);
//    	
//    	
//    	DM dm2 = new DM();
//    	dm.setObservation("Mrid2");
//    	dm.setDateCreation(datetime);
//    	dm.setMedecin(medecin);
//    	dm.setPatient(person2);
//    	
//    	
//    	
//    	
//    	IPatient pc=new IPatient();
//    	IAssistant ac=new IAssistant();
//    	IHome h=new IHome();
    	
    	
    	
//    	System.out.println(pc.addPatient(person2));
//    	System.out.println(pc.addPatient(person));
    	
//    	ac.take_RDV(rdv);
//    	pc.confirm_rdv(rdv);
//    	System.out.println(h.revenu());
//    	System.out.println(h.patient());
//    	System.out.println(h.rdv());
    	
    	
//    	
//    	System.out.println(cmdi.total_revenu());
//    	

//
//    	cmdi.addPatient(person);
//    	cmdi.addPatient(person);
//    	cmdi.addAssistant(assistant);
//    	cmdi.addMedecin(medecin);
    	
//    	cmdi.addRdv(rdv);
//    	cmdi.addRdv(rdv);
//    	cmdi.addRdv(rdv2);
//    	cmdi.addDM(dm2);
//    	cmdi.addDM(dm);
    	
    	
//    	
//    	
//    	
//    	Patient p = cmdi.findPatient(1);
//    	System.out.println(p.toString());
//    	
//    	DM dm2 = cmdi.getDM(4); 
//    	System.out.println(dm2.toString());
//    	
//    	
//    
//    	DM dm3 = cmdi.getDMByPatientid(1);
//    	System.out.println(dm3.toString());
    	
    	
    	
    	
    	//System.out.println("CHECK DB !");

    }
}
