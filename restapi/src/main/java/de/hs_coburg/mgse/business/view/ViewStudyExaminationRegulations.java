package de.hs_coburg.mgse.business.view;

import de.hs_coburg.mgse.persistence.model.Glossary;

import java.util.List;

public class ViewStudyExaminationRegulations {

    private long id;
    private String shortName;
    private String title;
    private String validityDate;
    private List<ViewCourseOfStudy> courseOfStudiy;
    private String preface;
    private List<ViewParagraph> paragraphs;
    private List<ViewStudySection> studySections;
    private List<ViewFootnote> footnotes;
    private Glossary glossary;

    public ViewStudyExaminationRegulations() { }

    public ViewStudyExaminationRegulations(long id, String shortName, String title, String validityDate, List<ViewCourseOfStudy> courseOfStudiy, String preface, List<ViewParagraph> paragraphs, List<ViewStudySection> studySections, List<ViewFootnote> footnotes, Glossary glossary) {
        this.id = id;
        this.shortName = shortName;
        this.title = title;
        this.validityDate = validityDate;
        this.courseOfStudiy = courseOfStudiy;
        this.preface = preface;
        this.paragraphs = paragraphs;
        this.studySections = studySections;
        this.footnotes = footnotes;
        this.glossary = glossary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public List<ViewCourseOfStudy> getCourseOfStudiy() {
        return courseOfStudiy;
    }

    public void setCourseOfStudiy(List<ViewCourseOfStudy> courseOfStudiy) {
        this.courseOfStudiy = courseOfStudiy;
    }

    public String getPreface() {
        return preface;
    }

    public void setPreface(String preface) {
        this.preface = preface;
    }

    public List<ViewParagraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<ViewParagraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<ViewStudySection> getStudySections() {
        return studySections;
    }

    public void setStudySections(List<ViewStudySection> studySections) {
        this.studySections = studySections;
    }

    public List<ViewFootnote> getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(List<ViewFootnote> footnotes) {
        this.footnotes = footnotes;
    }

    public Glossary getGlossary() {
        return glossary;
    }

    public void setGlossary(Glossary glossary) {
        this.glossary = glossary;
    }
}
