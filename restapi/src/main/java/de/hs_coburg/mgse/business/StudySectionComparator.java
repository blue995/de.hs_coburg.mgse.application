package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.StudySection;

import java.util.Comparator;

public class StudySectionComparator implements Comparator<StudySection>{
    @Override
    public int compare(StudySection studySection, StudySection t1) {
        Integer first = studySection.getFirstSemester();
        Integer second = t1.getFirstSemester();
        return first.compareTo(second);
    }
}
