package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import java.util.List;

public interface CoursesBusinessIf {

    List<CourseOfStudies> readCourseOfStudiesList() throws Exception;
    CourseOfStudies readCourseOfStudies(long course_id) throws Exception;

}
