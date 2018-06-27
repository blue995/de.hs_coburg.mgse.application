package de.hs_coburg.mgse.business.view;

public class ViewCurriculumInfo {

    private long curriculumId;
    private String shortName;
    private String validityDate;

    public ViewCurriculumInfo() { }

    public ViewCurriculumInfo(long curriculumId, String shortName, String validityDate) {
        this.curriculumId = curriculumId;
        this.shortName = shortName;
        this.validityDate = validityDate;
    }

    public long getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(long curriculumId) {
        this.curriculumId = curriculumId;
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
}
