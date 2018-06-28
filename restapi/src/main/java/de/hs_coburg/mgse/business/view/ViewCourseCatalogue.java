package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewCourseCatalogue {

    private long id;
    private long catalogueId;
    private String shortName;
    private String validityDate;
    private String courseOfStudy;
    private String courseOfStudyAbbreviation;
    private String facultyName;
    private List<ViewCourse> courses;

    public ViewCourseCatalogue() { }

    public ViewCourseCatalogue(long id, long catalogueId, String shortName, String validityDate, String courseOfStudy, String courseOfStudyAbbreviation, String facultyName, List<ViewCourse> courses) {
        this.id = id;
        this.catalogueId = catalogueId;
        this.shortName = shortName;
        this.validityDate = validityDate;
        this.courseOfStudy = courseOfStudy;
        this.courseOfStudyAbbreviation = courseOfStudyAbbreviation;
        this.facultyName = facultyName;
        this.courses = courses;
    }


    public long getCatalogueId() {
        return catalogueId;
    }

    public void setCatalogueId(long catalogueId) {
        this.catalogueId = catalogueId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public String getCourseOfStudyAbbreviation() {
        return courseOfStudyAbbreviation;
    }

    public void setCourseOfStudyAbbreviation(String courseOfStudyAbbreviation) {
        this.courseOfStudyAbbreviation = courseOfStudyAbbreviation;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<ViewCourse> getCourses() {
        return courses;
    }

    public void setCourses(List<ViewCourse> courses) {
        this.courses = courses;
    }
}
