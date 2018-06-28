package de.hs_coburg.mgse.business.view;

public class ViewCourseOfStudy {

    private String name;
    private int etcs;
    private int semesters;
    private String requirements;
    private String facultyName;
    private String facultyShortName;
    private String degreeName;
    private String degreeAbbreviation;

    public ViewCourseOfStudy() { }

    public ViewCourseOfStudy(String name, int etcs, int semesters, String requirements, String facultyName, String facultyShortName, String degreeName, String degreeAbbreviation) {
        this.name = name;
        this.etcs = etcs;
        this.semesters = semesters;
        this.requirements = requirements;
        this.facultyName = facultyName;
        this.facultyShortName = facultyShortName;
        this.degreeName = degreeName;
        this.degreeAbbreviation = degreeAbbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }

    public int getSemesters() {
        return semesters;
    }

    public void setSemesters(int semesters) {
        this.semesters = semesters;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyShortName() {
        return facultyShortName;
    }

    public void setFacultyShortName(String facultyShortName) {
        this.facultyShortName = facultyShortName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getDegreeAbbreviation() {
        return degreeAbbreviation;
    }

    public void setDegreeAbbreviation(String degreeAbbreviation) {
        this.degreeAbbreviation = degreeAbbreviation;
    }
}
