package de.hs_coburg.mgse.business;

import java.util.List;

import de.hs_coburg.mgse.persistence.test.GlossaryBl;
import de.hs_coburg.mgse.persistence.test.GlossaryEntryBl;
import de.hs_coburg.mgse.persistence.test.GlossarySectionBl;

public interface GlossaryBusinessIf {

    // GlossaryBl
    void insertGlossary(GlossaryBl glossaryBl) throws Exception;
    void updateGlossary(long glossary_id, GlossaryBl glossaryBl) throws Exception;
    void deleteGlossary(long glossary_id) throws Exception;
    GlossaryBl readGlossary(long glossary_id) throws Exception;
    List<GlossaryBl> readGlossaryList() throws Exception;

    // GlossarySectionBl
    void insertGlossarySection(long glossary_id, GlossarySectionBl section) throws Exception;
    void updateGlossarySection(long glossary_id, long section_id, GlossarySectionBl section) throws Exception;
    void deleteGlossarySection(long glossary_id, long section_id) throws Exception;
    GlossarySectionBl readGlossarySection(long glossary_id, long section_id) throws Exception;

    // GlossaryEntryBl
    void insertGlossaryEntry(long glossary_id, long section_id, GlossaryEntryBl entry) throws Exception;
    void updateGlossaryEntry(long glossary_id, long section_id, long entry_id, GlossaryEntryBl entry) throws Exception;
    void deleteGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception;
    GlossaryEntryBl readGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception;

}
