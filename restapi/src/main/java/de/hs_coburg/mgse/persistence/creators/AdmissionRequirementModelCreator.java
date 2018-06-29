package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;		

import de.hs_coburg.mgse.persistence.model.AdmissionRequirement;

public class AdmissionRequirementModelCreator {
    public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        
        return resp;
    }
    
    //0: AdmissionRequirement
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();

			AdmissionRequirement ar0 = new AdmissionRequirement();
			ar0.setValue("Allgemeine Hochschulreife");
			em.persist(ar0);
			
			AdmissionRequirement ar1 = new AdmissionRequirement();
			ar1.setValue("Fachhochschulreife");
			em.persist(ar1);
			
			AdmissionRequirement ar2 = new AdmissionRequirement();
			ar2.setValue("Bachelor of Science");
			em.persist(ar2);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
