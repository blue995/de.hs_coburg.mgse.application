package de.hs_coburg.mgse.business.view;

public class ViewExamType {

    private String name;
    private String abbreviation;
    private String examTestUnit;
    private int lowerBound;
    private int upperBound;

    public ViewExamType() { }

    public ViewExamType(String name, String abbreviation, String examTestUnit, int lowerBound, int upperBound) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.examTestUnit = examTestUnit;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
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

    public String getExamTestUnit() {
        return examTestUnit;
    }

    public void setExamTestUnit(String examTestUnit) {
        this.examTestUnit = examTestUnit;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBond) {
        this.upperBound = upperBound;
    }
}
