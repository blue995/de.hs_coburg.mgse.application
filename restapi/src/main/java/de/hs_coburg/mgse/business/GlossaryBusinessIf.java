package de.hs_coburg.mgse.business;

import java.util.List;

import de.hs_coburg.mgse.persistence.test.Glossary;
import de.hs_coburg.mgse.persistence.test.GlossarySection;
import de.hs_coburg.mgse.persistence.test.GlossaryEntry;

public interface GlossaryBusinessIf {

    // Glossary
    void insertGlossary(Glossary glossary) throws Exception;
    void updateGlossary(long glossary_id, Glossary glossary) throws Exception;
    void deleteGlossary(long glossary_id) throws Exception;
    Glossary readGlossary(long glossary_id) throws Exception;
    List<Glossary> readGlossaryList() throws Exception;

    // GlossarySection
    void insertGlossarySection(long glossary_id, GlossarySection section) throws Exception;
    void updateGlossarySection(long glossary_id, long section_id, GlossarySection section) throws Exception;
    void deleteGlossarySection(long glossary_id, long section_id) throws Exception;
    GlossarySection readGlossarySection(long glossary_id, long section_id) throws Exception;

    // GlossaryEntry
    void insertGlossaryEntry(long glossary_id, long section_id, GlossaryEntry entry) throws Exception;
    void updateGlossaryEntry(long glossary_id, long section_id, long entry_id, GlossaryEntry entry) throws Exception;
    void deleteGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception;
    GlossaryEntry readGlossaryEntry(long glossary_id, long section_id, long entry_id) throws Exception;

}
