package de.hs_coburg.mgse.business.test;

import de.hs_coburg.mgse.business.GlossaryBusinessIf;

import de.hs_coburg.mgse.persistence.test.Glossary;
import de.hs_coburg.mgse.persistence.test.GlossaryEntry;
import de.hs_coburg.mgse.persistence.test.GlossarySection;

import java.util.ArrayList;
import java.util.List;


public class GlossaryBusiness implements GlossaryBusinessIf {

    protected  List<Glossary> glossary_list;

    public GlossaryBusiness () {
        this.glossary_list = new ArrayList<>();

        this.glossary_list.add(new Glossary("Glossary One"));
        this.glossary_list.add(new Glossary("Glossary Two"));
        this.glossary_list.add(new Glossary("Glossary Three"));
    }

    @Override
    public void insertGlossary(Glossary glossary) throws Exception {
        this.glossary_list.add(glossary);
    }

    @Override
    public void updateGlossary(long glossary_id, Glossary glossary) throws Exception {
        for (int i = 0; i<this.glossary_list.size(); i++) {
            long id = this.glossary_list.get(i).getID();

            if (id == glossary_id) {
                glossary.setID(id);
                this.glossary_list.set(i, glossary);
                return;
            }
        }

        throw new Exception("Glossary konnte nicht bearbeitet werden");
    }

    @Override
    public void deleteGlossary(long glossary_id) throws Exception {
        for (int i = 0; i<this.glossary_list.size(); i++) {
            long id = this.glossary_list.get(i).getID();

            if (id == glossary_id) {
                this.glossary_list.remove(i);
                return;
            }
        }

        throw new Exception("Glossary konnte nicht entfernt werden");
    }

    @Override
    public Glossary readGlossary(long glossary_id) throws Exception {
        for (int i = 0; i<this.glossary_list.size(); i++) {
            Glossary glossary = this.glossary_list.get(i);
            if (glossary.getID() == glossary_id) return glossary;
        }

        throw new Exception("Glossary " + glossary_id + " nicht gefunden");
    }

    @Override
    public List<Glossary> readGlossaryList() throws Exception {
        List<Glossary> glossary_list = new ArrayList<>();

        for (Glossary g : this.glossary_list) {
            Glossary glossary = new Glossary(g);
            glossary.setSectionList(null);
            glossary_list.add(glossary);
        }

        return glossary_list;
    }

    @Override
    public void insertGlossarySection(long glossary_id, GlossarySection section) throws Exception {

    }

    @Override
    public void updateGlossarySection(long glossary_id, long section_id, GlossarySection section) throws Exception {

    }

    @Override
    public void deleteGlossarySection(long glossary_id, long section_id) throws Exception {

    }

    @Override
    public GlossarySection readGlossarySection(long glossary_id, long section_id) throws Exception {
        return null;
    }

    @Override
    public void insertGlossaryEntry(long glossary_id, long section_id, GlossaryEntry entry) throws Exception {

    }

    @Override
    public void updateGlossaryEntry(long glossary_id, long section_id, long entry_id, GlossaryEntry entry) throws Exception {

    }

    @Override
    public void deleteGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception {

    }

    @Override
    public GlossaryEntry readGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception {
        return null;
    }
}
