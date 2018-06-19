package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.Curriculum;
import java.util.List;


public interface CurriculumBusinessIf {

    List<Curriculum> readCurriculumList() throws Exception;
    Curriculum readCurriculum(long curriculum_id) throws Exception;

}
