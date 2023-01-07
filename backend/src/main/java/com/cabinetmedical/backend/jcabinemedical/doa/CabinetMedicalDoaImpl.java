package com.cabinetmedical.backend.jcabinemedical.doa;

import java.io.Console;
import java.util.Date;
import java.util.List;



import com.cabinetmedical.backend.jcabinemedical.Entity.Assistant;
import com.cabinetmedical.backend.jcabinemedical.Entity.Compte;
import com.cabinetmedical.backend.jcabinemedical.Entity.DM;
import com.cabinetmedical.backend.jcabinemedical.Entity.Medecin;
import com.cabinetmedical.backend.jcabinemedical.Entity.Patient;
import com.cabinetmedical.backend.jcabinemedical.Entity.RDV;
import com.cabinetmedical.backend.jcabinemedical.Entity.Status;
import jakarta.persistence.*;

public class CabinetMedicalDoaImpl implements ICabinetMedical {
	@PersistenceContext
	EntityManager em;
	
	
	public CabinetMedicalDoaImpl() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cabinet");
		em=emf.createEntityManager();
	}

	@Override
	public void addRdv(RDV rdv) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(rdv);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteRdv(RDV rdv) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			RDV r = em.find(RDV.class, rdv.getRid());
			em.remove(r);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void editRdv(RDV rdv) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.merge(rdv);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
	}

	@Override
	public RDV findRdv(int rdv) {
		RDV r = em.find(RDV.class, rdv);
		return r;
		// TODO Auto-generated method stub
	}

	@Override
	public List<RDV> all_RDV() {
		Query q = em.createQuery("SELECT p FROM RDV p");
		return q.getResultList();	
		// TODO Auto-generated method stub
	}

	//@Override
//	public RDV takeRdv(Patient p, Assistant a) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void addDM(DM dm) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(dm);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteDM(DM dm) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			DM r = em.find(DM.class, dm.getId());
			em.remove(r);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void editDM(DM dm) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.merge(dm);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public DM getDM(DM dm1) {
		DM dm =em.find(DM.class, dm1);		
		return dm;
	}

	@Override
	public void addPatient(Patient p) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {	
			em.persist(p);
			trans.commit();
			System.out.println("Patient added");

		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
			System.out.println("error on add");
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Patient findPatient(int p) {
		Patient pt = em.find(Patient.class, p);	
		// TODO Auto-generated method stub
		return pt;
	}

	@Override
	public List<Patient> all_Patient() {
		Query q = em.createQuery("SELECT p FROM Patient p");
		return q.getResultList();
		// TODO Auto-generated method stub
	}

	@Override
	public void addMedecin(Medecin m) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(m);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void addAssistant(Assistant a) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(a);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public List<Patient> findPatientByName(String name) {
		Query q =em.createQuery("SELECT p FROM Patient p WHERE p.fname = :x");
		q.setParameter("x", "%"+name+"%");
		return q.getResultList();
		
		// TODO Auto-generated method stub
	}

	@Override
	public  DM getDMByPatientid(int p) {
		Patient patient = em.find(Patient.class, p);
		Query q =em.createQuery("SELECT dm FROM DM dm WHERE dm.patient = :x ");
		q.setParameter("x", patient);
		DM dm=new DM();
		List<DM> dms = q.getResultList();
		
		
		dm.setId(dms.get(0).getId());
		dm.setDateCreation(dms.get(0).getDateCreation());
		dm.setObservation(dms.get(0).getObservation());
		dm.setMedecin(dms.get(0).getMedecin());
		dm.setPatient(dms.get(0).getPatient());
		
		return dm;
		// TODO Auto-generated method stub
	}

	@Override
	public void CancelRdv(RDV rdv) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			rdv.setStatus(Status.CANCELED);
			em.merge(rdv);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConfirmRdv(RDV rdv) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			rdv.setStatus(Status.CONFIRMED);
			em.merge(rdv);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NotConfirmRdv(RDV rdv) {
		
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			rdv.setStatus(Status.NOT_COMFIRMED);
			em.merge(rdv);
			trans.commit();
		}catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultCancel(RDV rdv) {
		Date datetime = new Date();
		if(rdv.getStartRdv().compareTo(datetime)<0 && rdv.getStatus().equals(Status.PENDING)) {
			this.CancelRdv(rdv);
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Compte Find_User(Compte c) {
		
		Compte c2 = em.find(Compte.class, c);
		
		return c2;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public long total_rdv() {
		Query q =em.createQuery("SELECT COUNT(r) FROM RDV r");
		// TODO Auto-generated method stub
		return (long) q.getSingleResult();
	}

	@Override
	public long total_patient() {
		
		Query q =em.createQuery("SELECT COUNT(p) FROM Patient p");
		// TODO Auto-generated method stub
		return (long) q.getSingleResult();
	}

	@Override
	public long total_revenu() {
		Query q =em.createQuery("SELECT COUNT(r) FROM RDV r WHERE r.status = :x");
		q.setParameter("x", Status.CONFIRMED);
		
		long number = (long) q.getSingleResult();
		// TODO Auto-generated method stub
		return number*200;
	}


}
