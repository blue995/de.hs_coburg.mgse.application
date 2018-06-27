package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewModule {

    private String completeName;
    private int etcs;
    private int quantifier;
    private int semesterHours;
    private List<ViewCourseType> courseTypes;
    private List<ViewExamType> examTypes;
    private ViewGlossaryEntry details;
    private int count;

    public ViewModule() { }

    public ViewModule(String completeName, int etcs, int quantifier, int semesterHours, List<ViewCourseType> courseTypes, List<ViewExamType> examTypes, ViewGlossaryEntry details, int count) {
        this.completeName = completeName;
        this.etcs = etcs;
        this.quantifier = quantifier;
        this.semesterHours = semesterHours;
        this.courseTypes = courseTypes;
        this.examTypes = examTypes;
        this.details = details;
        this.count = count;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }

    public int getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(int quantifier) {
        this.quantifier = quantifier;
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(int semesterHours) {
        this.semesterHours = semesterHours;
    }

    public List<ViewCourseType> getCourseTypes() {
        return courseTypes;
    }

    public void setCourseTypes(List<ViewCourseType> courseTypes) {
        this.courseTypes = courseTypes;
    }

    public List<ViewExamType> getExamTypes() {
        return examTypes;
    }

    public void setExamTypes(List<ViewExamType> examTypes) {
        this.examTypes = examTypes;
    }

    public ViewGlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(ViewGlossaryEntry details) {
        this.details = details;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
