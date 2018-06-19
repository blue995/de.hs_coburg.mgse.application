package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.Glossary;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

import javax.persistence.EntityManager;
import java.util.List;


public class GlossaryBusiness implements GlossaryBusinessIf {

    @Override
    public List<Glossary> readGlossaryList() throws Exception {
        List<Glossary> glossary_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            glossary_list = em.createQuery("SELECT x FROM Glossary x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (glossary_list == null) throw new Exception("Glossary list not found");
        return glossary_list;
    }

    @Override
    public void insertGlossarySection(GlossarySection section) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void updateGlossarySection(long section_id, GlossarySection section) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void deleteGlossarySection(long section_id) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public GlossarySection readGlossarySection(long section_id) throws Exception {
        throw new Exception("Not implemented");
        //return null;
    }

    @Override
    public void insertGlossaryEntry(long section_id, GlossaryEntry entry) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void updateGlossaryEntry(long section_id, long entry_id, GlossaryEntry entry) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void deleteGlossaryEntry(long section_id, long entry_id) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public GlossaryEntry readGlossaryEntry(long section_id, long entry_id) throws Exception {
        throw new Exception("Not implemented");
        //return null;
    }
}
