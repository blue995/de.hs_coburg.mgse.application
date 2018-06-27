package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewCurriculum {

    private long id;
    private int version;
    private String validityDate;
    private String semester;
    private int year;
    private String completeName;
    private List<ViewCurriculumStudySection> curriculumStudySections;
    private List<ViewFootnote> footnotes;
    private ViewGlossary glossary;
}
