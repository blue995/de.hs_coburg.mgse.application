package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;

import de.hs_coburg.mgse.persistence.model.CourseTypeDeclaration;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;

public class CourseTypeDeclarationModelCreator {
    public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        
        return resp;
    }
    
    //0: CourseTypeDeclaration
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			
			CourseTypeDeclaration ctd0 = new CourseTypeDeclaration();
			GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'SU' AND ge.meaning = '' AND ge.word = 'Seminaristischer Unterricht'").getSingleResult();
			ctd0.setDetails(ge0);
			em.persist(ctd0);
			
			CourseTypeDeclaration ctd1 = new CourseTypeDeclaration();
			GlossaryEntry ge1 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'Ü' AND ge.meaning = '' AND ge.word = 'Übung'").getSingleResult();
			ctd1.setDetails(ge1);
			em.persist(ctd1);
			
			CourseTypeDeclaration ctd2 = new CourseTypeDeclaration();
			GlossaryEntry ge2 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'V' AND ge.meaning = '' AND ge.word = 'Lehrvortrag'").getSingleResult();
			ctd2.setDetails(ge2);
			em.persist(ctd2);
			
			CourseTypeDeclaration ctd3 = new CourseTypeDeclaration();
			GlossaryEntry ge3 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'Pr' AND ge.meaning = '' AND ge.word = 'Praktikum'").getSingleResult();
			ctd3.setDetails(ge3);
			em.persist(ctd3);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
