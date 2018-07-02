package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.ViewCourseCatalogue;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.ModuleHandbook;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CourseCatalogueBusiness implements CourseCatalogueBusinessIf {
    @Override
    public List<ModuleHandbook> readCourseCatalogueList() throws Exception {
        List<ModuleHandbook> list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            list = em.createQuery("SELECT x FROM ModuleHandbook x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (list == null) throw new Exception("Course catalogue list not found");
        return list;
    }

    @Override
    public List<ViewCourseCatalogue> readViewCourseCatalogueList() throws Exception {
        List<ViewCourseCatalogue> view_course_catalogue_list = new ArrayList<>();

        try {
            List<ModuleHandbook> course_catalogue_list;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            course_catalogue_list = em.createQuery("SELECT x FROM ModuleHandbook x").getResultList();
            em.getTransaction().commit();
            //em.close();

            for (ModuleHandbook course_catalogue : course_catalogue_list) {
                ViewCourseCatalogue view_course_catalogue = new ViewCourseCatalogue();
                view_course_catalogue.setCatalogueId(course_catalogue.getId());
                view_course_catalogue_list.add(view_course_catalogue);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (view_course_catalogue_list == null) throw new Exception("Course catalogue list not found");
        return view_course_catalogue_list;
    }

    @Override
    public ModuleHandbook readCourseCatalogue(long id) throws Exception {
        ModuleHandbook item;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            item = em.find(ModuleHandbook.class, id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (item == null) throw new Exception("Course catalogue not found");
        return item;
    }

    @Override
    public ViewCourseCatalogue readViewCourseCatalogue(long id) throws Exception {
        ViewCourseCatalogue view_course_catalogue = null;

        try {
            ModuleHandbook course_catalogue;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            course_catalogue = em.find(ModuleHandbook.class, id);
            em.getTransaction().commit();
            if (course_catalogue == null) throw new Exception("Course catalogue not found");

            view_course_catalogue = new ViewCourseCatalogue();
            view_course_catalogue.setCatalogueId(course_catalogue.getId());

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (view_course_catalogue == null) throw new Exception("Course catalogue list not found");
        return view_course_catalogue;
    }
}
