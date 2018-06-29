package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Module;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.CourseTypeDeclaration;
import de.hs_coburg.mgse.persistence.model.ExamType;
import de.hs_coburg.mgse.persistence.model.ExamTypeDeclaration;

public class ModuleModelCreator {
    public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        resp = resp && createModelPart1();
        
        return resp;
    }

	//0: Module
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			
			Module m0 = new Module();
			m0.setCompleteName("Prog1");
			m0.setEcts(5);
			m0.setQuantifier(Double.parseDouble("2.2"));
			m0.setSemesterHours(4);
			//Concrete Module
			GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'Prog1' AND ge.meaning = '' AND ge.word = 'Programmieren 1'").getSingleResult();
			m0.setDetails(ge0);
			
			//CourseTypeDeclaration
			List<CourseTypeDeclaration> l_ctd0 = new ArrayList<CourseTypeDeclaration>();
			CourseTypeDeclaration ctd0 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'Pr' AND ctd.details.meaning = '' AND ctd.details.word = 'Praktikum'").getSingleResult();
			l_ctd0.add(ctd0);
			CourseTypeDeclaration ctd1 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'SU' AND ctd.details.meaning = '' AND ctd.details.word = 'Seminaristischer Unterricht'").getSingleResult();
			l_ctd0.add(ctd1);
			CourseTypeDeclaration ctd2 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'Ü' AND ctd.details.meaning = '' AND ctd.details.word = 'Übung'").getSingleResult();
			l_ctd0.add(ctd2);
			CourseTypeDeclaration ctd3 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'V' AND ctd.details.meaning = '' AND ctd.details.word = 'Lehrvortrag'").getSingleResult();
			l_ctd0.add(ctd3);
			m0.setCourseType(l_ctd0);
			
			//ExamType + Relation to ExamTypeDeclaration
			List<ExamType> l_et0 = new ArrayList<ExamType>();
			ExamType et0 = new ExamType();
			et0.setLowerBound(90);
			et0.setUpperBound(120);
			ExamTypeDeclaration etd0 = (ExamTypeDeclaration) em.createQuery("SELECT etd FROM ExamTypeDeclaration etd WHERE etd.details.abbreviation = 'schrPr' AND etd.details.meaning = '' AND etd.details.word = 'Schriftliche Prüfung'").getSingleResult();
			et0.setExamTypeDeclaration(etd0);
			l_et0.add(et0);
			m0.setExamTypes(l_et0);
			
			em.persist(m0);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	private static boolean createModelPart1() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			
			Module m1 = new Module();
			m1.setCompleteName("GI");
			m1.setEcts(7);
			m1.setQuantifier(Double.parseDouble("2.2"));
			m1.setSemesterHours(6);
			//Concrete Module
			GlossaryEntry ge1 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'GI' AND ge.meaning = '' AND ge.word = 'Grundlagen der Informatik'").getSingleResult();
			m1.setDetails(ge1);
			
			//CourseTypeDeclaration
			List<CourseTypeDeclaration> l_ctd1 = new ArrayList<CourseTypeDeclaration>();
			CourseTypeDeclaration ctd4 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'Pr' AND ctd.details.meaning = '' AND ctd.details.word = 'Praktikum'").getSingleResult();
			l_ctd1.add(ctd4);
			CourseTypeDeclaration ctd5 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'SU' AND ctd.details.meaning = '' AND ctd.details.word = 'Seminaristischer Unterricht'").getSingleResult();
			l_ctd1.add(ctd5);
			CourseTypeDeclaration ctd6 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'Ü' AND ctd.details.meaning = '' AND ctd.details.word = 'Übung'").getSingleResult();
			l_ctd1.add(ctd6);
			CourseTypeDeclaration ctd7 = (CourseTypeDeclaration) em.createQuery("SELECT ctd FROM CourseTypeDeclaration ctd WHERE ctd.details.abbreviation = 'V' AND ctd.details.meaning = '' AND ctd.details.word = 'Lehrvortrag'").getSingleResult();
			l_ctd1.add(ctd7);
			m1.setCourseType(l_ctd1);
			
			//ExamType + Relation to ExamTypeDeclaration
			List<ExamType> l_et1 = new ArrayList<ExamType>();
			ExamType et1 = new ExamType();
			et1.setLowerBound(90);
			et1.setUpperBound(120);
			ExamTypeDeclaration etd1 = (ExamTypeDeclaration) em.createQuery("SELECT etd FROM ExamTypeDeclaration etd WHERE etd.details.abbreviation = 'schrPr' AND etd.details.meaning = '' AND etd.details.word = 'Schriftliche Prüfung'").getSingleResult();
			et1.setExamTypeDeclaration(etd1);
			l_et1.add(et1);
			m1.setExamTypes(l_et1);
			
			em.persist(m1);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
