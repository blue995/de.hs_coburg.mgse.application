package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.Faculty;

import java.util.List;

public interface FacultyBusinessIf {

    List<Faculty> readFacultyList() throws Exception;
    Faculty readFaculty(long faculty_id) throws Exception;

}
