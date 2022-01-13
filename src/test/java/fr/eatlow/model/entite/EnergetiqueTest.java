package fr.eatlow.model.entite;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import static org.hamcrest.Matchers.*;

import org.junit.Test;



public class EnergetiqueTest {

	@Test
	public void testcreate() {
		EntityManagerFactory efm = null;

		try {
			efm = Persistence.createEntityManagerFactory("bddeatlow");
			EntityManager em = efm.createEntityManager();
			
			em.getTransaction().begin();
			
			ECoupEnergetique e = new ECoupEnergetique();
			
			e.setAgriculture((float) 0.1);
			e.setConsomation((float) 0.2);
			e.setEmballage((float) 0.3);
			e.setSupermarche((float) 0.4);
			e.setTransformation((float) 0.5);
			e.setTransport((float) 0.6);
			
			em.persist(e);
			em.getTransaction().commit();
			
			assertNotNull(e.getId());
			
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (efm != null)
				efm.close();
		}
	}

	@Test
	public void testdelete() {
		EntityManagerFactory efm = null;

		try {
			efm = Persistence.createEntityManagerFactory("bddeatlow");
			EntityManager em = efm.createEntityManager();
			
			em.getTransaction().begin();
			ECoupEnergetique esupp = em.find(ECoupEnergetique.class, 1);
			em.remove(esupp);
			em.getTransaction().commit();
			
			assertNotNull(esupp.getId());
			
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (efm != null)
				efm.close();
		}
	}
	
	@Test
	public void testupdate() {
		EntityManagerFactory efm = null;

		try {
			efm = Persistence.createEntityManagerFactory("bddeatlow");
			EntityManager em = efm.createEntityManager();
			
			em.getTransaction().begin();
			
			ECoupEnergetique eupdate = em.find(ECoupEnergetique.class, 2);
			eupdate.setAgriculture((float) 1.6);
			em.merge(eupdate);
			em.getTransaction().commit();
			
			assertNotNull(eupdate.getId());
			
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (efm != null)
				efm.close();
		}
	}
	
	@Test
	public void testextractOne() {
			EntityManagerFactory efm = null;

		try {
			efm = Persistence.createEntityManagerFactory("bddeatlow");
			EntityManager em = efm.createEntityManager();
			TypedQuery<ECoupEnergetique> query = em.createQuery("select * from COUP_ENERGETIQUE where ID='1'", ECoupEnergetique.class);
			
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (efm != null)
				efm.close();
		}
	}
	
	@Test
	public void testextractAll() {
			EntityManagerFactory efm = null;

		try {
			efm = Persistence.createEntityManagerFactory("bddeatlow");
			EntityManager em = efm.createEntityManager();
			TypedQuery<ECoupEnergetique> query = em.createQuery("select l3 from ELivre l3 ", ECoupEnergetique.class);
		    List<ECoupEnergetique> CpEnerg = query.getResultList();
		   
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (efm != null)
				efm.close();
		}
	}
	

    
	
}
