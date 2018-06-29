package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;
import de.hs_coburg.mgse.business.view.ViewStudyExaminationRegulations;
import de.hs_coburg.mgse.business.view.ViewStudyExaminationRegulationsMeta;

import java.util.List;

public interface SerBusinessIf {

    List<StudyExaminationRegulations> readStudyExaminationRegulationsList() throws Exception;
    List<ViewStudyExaminationRegulationsMeta> readViewStudyExaminationRegulationsList() throws Exception;

    StudyExaminationRegulations readStudyExaminationRegulations(long ser_id) throws Exception;
    ViewStudyExaminationRegulations readViewStudyExaminationRegulations(long ser_id) throws Exception;
}
