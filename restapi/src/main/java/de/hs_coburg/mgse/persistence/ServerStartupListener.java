package de.hs_coburg.mgse.persistence;

import de.hs_coburg.mgse.persistence.creators.*;

import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Collection;
import java.util.LinkedList;

public class ServerStartupListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            HibernateUtil.getEntityManager();
        } catch (NamingException e) {
            e.printStackTrace();
        }
        Collection<Class<?>> successfulClasses = new LinkedList<>();
        boolean msg = true;

        // Create Glossaries
        msg = msg && GlossaryModelCreator.createModel();
        if(msg) successfulClasses.add(GlossaryModelCreator.class);

        // Create Degrees
        msg = msg && DegreeModelCreator.createModel();
        if(msg) successfulClasses.add(DegreeModelCreator.class);

        // Create AdmissionRequirements
        msg = msg && AdmissionRequirementModelCreator.createModel();
        if(msg) successfulClasses.add(AdmissionRequirementModelCreator.class);

        // Create Courses
        msg = msg && CourseModelCreator.createModel();
        if(msg) successfulClasses.add(CourseModelCreator.class);

        // Create CourseTypeDeclaration
        msg = msg && CourseTypeDeclarationModelCreator.createModel();
        if(msg) successfulClasses.add(CourseTypeDeclarationModelCreator.class);

        // Create ExamTypeDeclaration
        msg = msg && ExamTypeDeclarationModelCreator.createModel();
        if(msg) successfulClasses.add(ExamTypeDeclarationModelCreator.class);

        // Create Module
        msg = msg && ModuleModelCreator.createModel();
        if(msg) successfulClasses.add(ModuleModelCreator.class);

        // Create SPO
        msg = msg && SPOModelCreator.createModel();
        if(msg) successfulClasses.add(SPOModelCreator.class);

        // Create Aid
        msg = msg && AidModelCreator.createModel();
        if(msg) successfulClasses.add(AidModelCreator.class);

        // Create Curriculum
        msg = msg && CurriculumModelCreator.createModel();
        if(msg) successfulClasses.add(CurriculumModelCreator.class);

        // Create ModuleHandbookModelCreator
        //msg = msg && ModuleHandbookModelCreator.createModel();
        //if(msg) successfulClasses.add(ModuleHandbookModelCreator.class);


        for (Class<?> clazz : successfulClasses) {
            System.out.println("Initialized: " + clazz);
        }
        if(msg)
            System.out.println("Got it!");
        else
            System.out.println("Maybe not..");
    }
}
