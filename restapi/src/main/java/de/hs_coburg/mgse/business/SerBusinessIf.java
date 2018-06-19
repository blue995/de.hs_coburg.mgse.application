package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

import java.util.List;

public interface SerBusinessIf {

    List<StudyExaminationRegulations> readStudyExaminationRegulationsList() throws Exception;

    StudyExaminationRegulations readStudyExaminationRegulations(long ser_id) throws Exception;
}
