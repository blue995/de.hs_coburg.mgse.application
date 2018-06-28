package de.hs_coburg.mgse.business.view;

public class ViewCourseType {

    private String name;
    private String abbreviation;

    public ViewCourseType() { }

    public ViewCourseType(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
