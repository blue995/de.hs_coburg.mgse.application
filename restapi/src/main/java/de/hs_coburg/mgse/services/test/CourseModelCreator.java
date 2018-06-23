package de.hs_coburg.mgse.services.test;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Faculty;
import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import de.hs_coburg.mgse.persistence.model.Professor;
import de.hs_coburg.mgse.persistence.model.Degree;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;

    public class CourseModelCreator {
        public boolean createModel() {
            boolean resp = true;
            try {
                EntityManager em = HibernateUtil.getEntityManager();
                em.getTransaction().begin();

                //Implement me
                Faculty f = new Faculty();
                f.setCompleteName("Elektrotechnik und Informatik");
                List<CourseOfStudies> l_cos = new ArrayList<CourseOfStudies>();
                List<Professor> l_p = new ArrayList<Professor>();

                CourseOfStudies cos0 = new CourseOfStudies();
                cos0.setCompleteName("Informatik");
                cos0.setEcts(210);
                cos0.setSemester(7);
                Degree d0 = (Degree) em.createQuery("SELECT d FROM Degree d WHERE d.degreeClass.completeName = 'Bachelor' AND d.subDegree.completeName = 'Science'").getSingleResult();
                cos0.setDegree(d0);
                l_cos.add(cos0);
                //persist?

                CourseOfStudies cos1 = new CourseOfStudies();
                cos1.setCompleteName("Informatik");
                cos1.setEcts(90);
                cos1.setSemester(3);
                Degree d1 = (Degree) em.createQuery("SELECT d FROM Degree d WHERE d.degreeClass.completeName = 'Master' AND d.subDegree.completeName = 'Science'").getSingleResult();
                cos1.setDegree(d1);
                l_cos.add(cos1);
                //persist?

                Professor p0 = new Professor();
                p0.setFirstName("Tobias");
                p0.setMiddleName("");
                p0.setLastName("Blaufuß");
                p0.setRoom("Oben");
                p0.setEmail("tobias.blaufuss@stud.hs-coburg.de");
                GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'TB' AND ge.word = 'Tobias Blaufuß' AND ge.meaning = '' ").getSingleResult();
                p0.setAbbreviation(ge0);
                l_p.add(p0);
                //persist?

                Professor p1 = new Professor();
                p1.setFirstName("Jonathan");
                p1.setMiddleName("Emmanuel");
                p1.setLastName("Braat");
                p1.setRoom("links");
                p1.setEmail("jonathan-emmanuel.braat@stud.hs-coburg.de");
                GlossaryEntry ge1 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'JEB' AND ge.word = 'Jonathan Emmanuel Braat' AND ge.meaning = '' ").getSingleResult();
                p1.setAbbreviation(ge1);
                l_p.add(p1);
                //persist?

                Professor p2 = new Professor();
                p2.setFirstName("Hakan");
                p2.setMiddleName("");
                p2.setLastName("Senkaya");
                p2.setRoom("Noch weiter oben");
                p2.setEmail("hakan.senkaya@stud.hs-coburg.de");
                GlossaryEntry ge2 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'HS' AND ge.word = 'Hakan Senkaya' AND ge.meaning = '' ").getSingleResult();
                p2.setAbbreviation(ge2);
                l_p.add(p2);
                //persist?

                f.setProfessors(l_p);
                f.setCourseOfStudies(l_cos);
                em.persist(f);

                em.getTransaction().commit();
                //em.close();
            } catch(Exception e) {
                e.printStackTrace();
                resp = false;
            }
            return resp;
        }
    }