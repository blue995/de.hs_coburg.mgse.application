package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewModule {

    private String completeName;
    private int ects;
    private double quantifier;
    private int semesterHours;
    private List<ViewCourseType> courseTypes;
    private List<ViewExamType> examTypes;
    private ViewGlossaryEntry details;
    //private int count;

    public ViewModule() { }

    /*
    public ViewModule(String completeName, int ects, double quantifier, int semesterHours, List<ViewCourseType> courseTypes, List<ViewExamType> examTypes, ViewGlossaryEntry details, int count) {
        this.completeName = completeName;
        this.ects = ects;
        this.quantifier = quantifier;
        this.semesterHours = semesterHours;
        this.courseTypes = courseTypes;
        this.examTypes = examTypes;
        this.details = details;
        this.count = count;
    }
    */

    public ViewModule(String completeName, int ects, double quantifier, int semesterHours, List<ViewCourseType> courseTypes, List<ViewExamType> examTypes, ViewGlossaryEntry details) {
        this.completeName = completeName;
        this.ects = ects;
        this.quantifier = quantifier;
        this.semesterHours = semesterHours;
        this.courseTypes = courseTypes;
        this.examTypes = examTypes;
        this.details = details;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public double getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(double quantifier) {
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

    /*
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    */
}
