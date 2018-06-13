package de.hs_coburg.mgse.business;

import java.util.List;

import de.hs_coburg.mgse.persistence.model.Glossary;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

public interface GlossaryBusinessIf {

    // Glossary
    List<Glossary> readGlossaryList() throws Exception;

    // GlossarySection
    void insertGlossarySection(GlossarySection section) throws Exception;
    void updateGlossarySection(long section_id, GlossarySection section) throws Exception;
    void deleteGlossarySection(long section_id) throws Exception;
    GlossarySection readGlossarySection(long section_id) throws Exception;

    // GlossaryEntry
    void insertGlossaryEntry(long section_id, GlossaryEntry entry) throws Exception;
    void updateGlossaryEntry(long section_id, long entry_id, GlossaryEntry entry) throws Exception;
    void deleteGlossaryEntry(long section_id, long entry_id) throws Exception;
    GlossaryEntry readGlossaryEntry(long section_id, long entry_id) throws Exception;

}
