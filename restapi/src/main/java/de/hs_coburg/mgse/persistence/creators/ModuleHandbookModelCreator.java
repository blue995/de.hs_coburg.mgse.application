package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;		
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.ModuleHandbook;
import de.hs_coburg.mgse.persistence.model.ModuleDescription;
import de.hs_coburg.mgse.persistence.model.Workload;
import de.hs_coburg.mgse.persistence.model.ModuleAdmissionRequirement;

import de.hs_coburg.mgse.persistence.model.Curriculum;
import de.hs_coburg.mgse.persistence.model.ModuleSpecification;
import de.hs_coburg.mgse.persistence.model.Professor;


public class ModuleHandbookModelCreator {
	public static boolean createModel() {
        boolean result = true;
        
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            
            ModuleHandbook module_handbook = new ModuleHandbook();
            List<ModuleDescription> module_description_list = new ArrayList<ModuleDescription>();

			Curriculum curriculum = (Curriculum) em.createQuery("SELECT x FROM Curriculum x WHERE x.completeName = 'Studienplan für Sommersemester 2018, Informatik Bachelor'").getSingleResult();
			ModuleSpecification curriculum_entry;
			ModuleDescription module_desc;
			
			curriculum_entry = (ModuleSpecification) em.createQuery("SELECT x FROM ModuleSpecification x WHERE x.completeName = 'E1'").getSingleResult();
			
			if (curriculum_entry != null) {
				module_desc = new ModuleDescription();
				
				List<Professor> lecture_list = new ArrayList<Professor>();
				Professor lecture;
				
				lecture = (Professor) em.createQuery("SELECT x FROM Professor x WHERE x.completeName = 'HS'").getSingleResult();
				if (lecture != null) { lecture_list.add(lecture); }
				lecture = (Professor) em.createQuery("SELECT x FROM Professor x WHERE x.completeName = 'JEB'").getSingleResult();
				if (lecture != null) { lecture_list.add(lecture); }
				lecture = (Professor) em.createQuery("SELECT x FROM Professor x WHERE x.completeName = 'TB'").getSingleResult();
				if (lecture != null) { lecture_list.add(lecture); }
				
				module_desc.setCurriculumEntry(curriculum_entry);
				module_desc.setLanguage("deutsch");
				module_desc.setQualificationGoals("Fachlich-methodische Kompetenzen: Studierende sollen ...");
				module_desc.setContent("Einführung, Datentypen und Ausdr�cke, Kontrollstrukturen, Arrays und Zeiger, Prozedurale Programmierung, Rekursion, Objektorientierte Programmierung Teil 1, Strings, Exception Handling");
				module_desc.setLiterature("Ullenboom, Christian: Java ist auch eine Insel, Galileo Computing jeweils in der neusten Auflage");
				if (lecture_list != null && lecture_list.size() > 0) module_desc.setLectures(lecture_list);
				//module_desc.setAdmissionRequirements([de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.ModuleAdmissionRequirementImpl@2a1edad4 (text: keine)]);
				//module_desc.setWorkloads([de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.WorkloadImpl@25ddbbbb (description: Präsenz  (30 h Seminaristischer Unterricht, 30 h Übung), effort: 60), de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.WorkloadImpl@4ebea12c (description: Eigenarbeit (30h Vor- und Nachbereitung des Lehrstoffs, 30h Lösung von Übungsaufgaben, 30h Prüfungsvorbereitung), effort: 90)]);
				//module_desc.setMedias([Tafel, Skript]);
				
				module_description_list.add(module_desc);
			}
			
			curriculum_entry = (ModuleSpecification) em.createQuery("SELECT x FROM ModuleSpecification x WHERE x.completeName = 'E2'").getSingleResult();
			
			if (curriculum_entry != null) {
				module_desc = new ModuleDescription();
				
				List<Professor> lecture_list = new ArrayList<Professor>();
				Professor lecture;
				
				lecture = (Professor) em.createQuery("SELECT x FROM Professor x WHERE x.completeName = 'HS'").getSingleResult();
				if (lecture != null) { lecture_list.add(lecture); }
				
				module_desc.setCurriculumEntry(curriculum_entry);
				module_desc.setLanguage("deutsch");
				module_desc.setQualificationGoals("Fachlich-methodische Kompetenzen: Studierende sollen ...");
				module_desc.setContent("Einführung, vom Problem zur Softwarelösung, Konzepte von Programmiersprachen, elementare Algorithmen, Übersetzung von Programmiersprachen");
				module_desc.setLiterature("H.-P. Gumm, M. Sommer: Einführung in die Informatik, Oldenbourg Verlag, München / Wien, 10. Auflage, 2012");
				if (lecture_list != null && lecture_list.size() > 0) module_desc.setLectures(lecture_list);
				//module_desc.setAdmissionRequirements([de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.ModuleAdmissionRequirementImpl@743cb8e0 (text: keine)]);
				//module_desc.setWorkloads([de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.WorkloadImpl@7fcbe147 (description: Präsenz (Seminaristischer Unterricht: 60 h, Übung: 60 h), effort: 90), de.hs_coburg.mgse.platform.modulehandbook.moduleHandbookModel.impl.WorkloadImpl@235f4c10 (description: Eigenarbeit (Nachbereitung Seminaristischer Unterricht: 40 h, Übung: 30 h, Prüfungsvorbereitung: 50 h), effort: 120)]);
				//module_desc.setMedias([Tafel, Skript]);
				
				module_description_list.add(module_desc);
			}
			
			module_handbook.setModuleDescriptions(module_description_list);
			// em.persist(module_handbook);
			
			curriculum.getModuleHandbooks().add(module_handbook);
			em.merge(curriculum);
			
            em.getTransaction().commit();
            //em.close();
        } catch(Exception e) {
            e.printStackTrace();
            result = false;
        }
        
        return result;
    }
}
