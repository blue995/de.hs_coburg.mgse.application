package de.hs_coburg.mgse.business.test;

import de.hs_coburg.mgse.business.GlossaryBusinessIf;

import de.hs_coburg.mgse.persistence.test.GlossaryBl;
import de.hs_coburg.mgse.persistence.test.GlossaryEntryBl;
import de.hs_coburg.mgse.persistence.test.GlossarySectionBl;

import java.util.ArrayList;
import java.util.List;


public class GlossaryBusiness implements GlossaryBusinessIf {

    protected  List<GlossaryBl> glossary_Bl_list;

    public GlossaryBusiness () {
        this.glossary_Bl_list = new ArrayList<>();

        this.glossary_Bl_list.add(new GlossaryBl("GlossaryBl One"));
        this.glossary_Bl_list.add(new GlossaryBl("GlossaryBl Two"));
        this.glossary_Bl_list.add(new GlossaryBl("GlossaryBl Three"));
    }

    @Override
    public void insertGlossary(GlossaryBl glossaryBl) throws Exception {
        this.glossary_Bl_list.add(glossaryBl);
    }

    @Override
    public void updateGlossary(long glossary_id, GlossaryBl glossaryBl) throws Exception {
        for (int i = 0; i<this.glossary_Bl_list.size(); i++) {
            long id = this.glossary_Bl_list.get(i).getID();

            if (id == glossary_id) {
                glossaryBl.setID(id);
                this.glossary_Bl_list.set(i, glossaryBl);
                return;
            }
        }

        throw new Exception("GlossaryBl konnte nicht bearbeitet werden");
    }

    @Override
    public void deleteGlossary(long glossary_id) throws Exception {
        for (int i = 0; i<this.glossary_Bl_list.size(); i++) {
            long id = this.glossary_Bl_list.get(i).getID();

            if (id == glossary_id) {
                this.glossary_Bl_list.remove(i);
                return;
            }
        }

        throw new Exception("GlossaryBl konnte nicht entfernt werden");
    }

    @Override
    public GlossaryBl readGlossary(long glossary_id) throws Exception {
        for (int i = 0; i<this.glossary_Bl_list.size(); i++) {
            GlossaryBl glossaryBl = this.glossary_Bl_list.get(i);
            if (glossaryBl.getID() == glossary_id) return glossaryBl;
        }

        throw new Exception("GlossaryBl " + glossary_id + " nicht gefunden");
    }

    @Override
    public List<GlossaryBl> readGlossaryList() throws Exception {
        List<GlossaryBl> glossary_Bl_list = new ArrayList<>();

        for (GlossaryBl g : this.glossary_Bl_list) {
            GlossaryBl glossaryBl = new GlossaryBl(g);
            glossaryBl.setSectionList(null);
            glossary_Bl_list.add(glossaryBl);
        }

        return glossary_Bl_list;
    }

    @Override
    public void insertGlossarySection(long glossary_id, GlossarySectionBl section) throws Exception {

    }

    @Override
    public void updateGlossarySection(long glossary_id, long section_id, GlossarySectionBl section) throws Exception {

    }

    @Override
    public void deleteGlossarySection(long glossary_id, long section_id) throws Exception {

    }

    @Override
    public GlossarySectionBl readGlossarySection(long glossary_id, long section_id) throws Exception {
        return null;
    }

    @Override
    public void insertGlossaryEntry(long glossary_id, long section_id, GlossaryEntryBl entry) throws Exception {

    }

    @Override
    public void updateGlossaryEntry(long glossary_id, long section_id, long entry_id, GlossaryEntryBl entry) throws Exception {

    }

    @Override
    public void deleteGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception {

    }

    @Override
    public GlossaryEntryBl readGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception {
        return null;
    }
}
