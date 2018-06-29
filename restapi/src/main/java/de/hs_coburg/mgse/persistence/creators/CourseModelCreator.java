package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;		
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Faculty;
import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import de.hs_coburg.mgse.persistence.model.Professor;
import de.hs_coburg.mgse.persistence.model.Degree;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.AdmissionRequirement;

public class CourseModelCreator {
    public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        
        return resp;
	}
	
	//0: Course
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			
			Faculty f = new Faculty();
			f.setCompleteName("Elektrotechnik und Informatik");
			List<CourseOfStudies> l_cos = new ArrayList<CourseOfStudies>();
			List<Professor> l_p = new ArrayList<Professor>();
			
			CourseOfStudies cos0 = new CourseOfStudies();
			List<AdmissionRequirement> l_cos0 = new ArrayList<AdmissionRequirement>();
			Degree d0 = (Degree) em.createQuery("SELECT d FROM Degree d WHERE d.degreeClass.completeName = 'Bachelor' AND d.subDegree.completeName = 'Science'").getSingleResult();
				AdmissionRequirement ar0 = (AdmissionRequirement) em.createQuery("SELECT ar FROM AdmissionRequirement  ar WHERE ar.value = 'Allgemeine Hochschulreife'").getSingleResult();
				l_cos0.add(ar0);
				AdmissionRequirement ar1 = (AdmissionRequirement) em.createQuery("SELECT ar FROM AdmissionRequirement  ar WHERE ar.value = 'Fachhochschulreife'").getSingleResult();
				l_cos0.add(ar1);
			setCourseOfStudiesMaterials(cos0, l_cos0, "Informatik", d0, 210, 7);
			l_cos.add(cos0);
			
			CourseOfStudies cos1 = new CourseOfStudies();
			List<AdmissionRequirement> l_cos1 = new ArrayList<AdmissionRequirement>();
			Degree d1 = (Degree) em.createQuery("SELECT d FROM Degree d WHERE d.degreeClass.completeName = 'Master' AND d.subDegree.completeName = 'Science'").getSingleResult();
				AdmissionRequirement ar2 = (AdmissionRequirement) em.createQuery("SELECT ar FROM AdmissionRequirement  ar WHERE ar.value = 'Bachelor of Science'").getSingleResult();
				l_cos1.add(ar2);
			setCourseOfStudiesMaterials(cos1, l_cos1, "Informatik", d1, 90, 3);
			l_cos.add(cos1);
			
			
			Professor p0 = new Professor();
			p0.setFirstName("Tobias");
			p0.setMiddleName("");
			p0.setLastName("Blaufuß");
			p0.setRoom("Oben");
			p0.setEmail("tobias.blaufuss@stud.hs-coburg.de");
			GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'TB' AND ge.word = 'Tobias Blaufuß' AND ge.meaning = '' ").getSingleResult();
			p0.setAbbreviation(ge0);
			l_p.add(p0);
			
			Professor p1 = new Professor();
			p1.setFirstName("Jonathan");
			p1.setMiddleName("Emmanuel");
			p1.setLastName("Braat");
			p1.setRoom("links");
			p1.setEmail("jonathan-emmanuel.braat@stud.hs-coburg.de");
			GlossaryEntry ge1 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'JEB' AND ge.word = 'Jonathan Emmanuel Braat' AND ge.meaning = '' ").getSingleResult();
			p1.setAbbreviation(ge1);
			l_p.add(p1);
			
			Professor p2 = new Professor();
			p2.setFirstName("Hakan");
			p2.setMiddleName("");
			p2.setLastName("Senkaya");
			p2.setRoom("Noch weiter oben");
			p2.setEmail("hakan.senkaya@stud.hs-coburg.de");
			GlossaryEntry ge2 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'HS' AND ge.word = 'Hakan Senkaya' AND ge.meaning = '' ").getSingleResult();
			p2.setAbbreviation(ge2);
			l_p.add(p2);
			
			
			f.setProfessors(l_p);
			f.setCourseOfStudies(l_cos);
			em.persist(f);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
    
    private static void setCourseOfStudiesMaterials(CourseOfStudies cos, List<AdmissionRequirement> l_cos, String completeName, Degree d, int ects, int semester) {
    	cos.setRequirements(l_cos);
    	cos.setCompleteName(completeName);
    	cos.setEcts(ects);
    	cos.setSemester(semester);
    	cos.setDegree(d);
	}
}
