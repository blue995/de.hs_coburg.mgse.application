package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.ViewCurriculum;
import de.hs_coburg.mgse.business.view.ViewCurriculumMeta;
import de.hs_coburg.mgse.persistence.model.Curriculum;
import java.util.List;


public interface CurriculumBusinessIf {

    List<Curriculum> readCurriculumList() throws Exception;
    List<ViewCurriculumMeta> readViewCurriculumList() throws Exception;
    Curriculum readCurriculum(long curriculum_id) throws Exception;
    ViewCurriculum readViewCurriculum(long curriculum_id) throws Exception;

}
