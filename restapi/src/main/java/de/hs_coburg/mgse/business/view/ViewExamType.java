package de.hs_coburg.mgse.business.view;

public class ViewExamType {

    private String name;
    private String abbreviation;
    private String examTestUnit;
    private int lowerBound;
    private int upperBond;

    public ViewExamType() { }

    public ViewExamType(String name, String abbreviation, String examTestUnit, int lowerBound, int upperBond) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.examTestUnit = examTestUnit;
        this.lowerBound = lowerBound;
        this.upperBond = upperBond;
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

    public int getUpperBond() {
        return upperBond;
    }

    public void setUpperBond(int upperBond) {
        this.upperBond = upperBond;
    }
}
