package de.hs_coburg.mgse.business.view;

import de.hs_coburg.mgse.persistence.model.Professor;

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

    public ViewCurriculum() {
    }

    public ViewCurriculum(long id, int version, String validityDate, String semester, int year, String completeName, List<ViewCurriculumStudySection> curriculumStudySections, List<ViewFootnote> footnotes, ViewGlossary glossary) {
        this.id = id;
        this.version = version;
        this.validityDate = validityDate;
        this.semester = semester;
        this.year = year;
        this.completeName = completeName;
        this.curriculumStudySections = curriculumStudySections;
        this.footnotes = footnotes;
        this.glossary = glossary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public List<ViewCurriculumStudySection> getCurriculumStudySections() {
        return curriculumStudySections;
    }

    public void setCurriculumStudySections(List<ViewCurriculumStudySection> curriculumStudySections) {
        this.curriculumStudySections = curriculumStudySections;
    }

    public List<ViewFootnote> getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(List<ViewFootnote> footnotes) {
        this.footnotes = footnotes;
    }

    public ViewGlossary getGlossary() {
        return glossary;
    }

    public void setGlossary(ViewGlossary glossary) {
        this.glossary = glossary;
    }
}
