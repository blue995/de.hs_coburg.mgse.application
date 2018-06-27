package de.hs_coburg.mgse.business.view;

public class ViewStudyExaminationRegulationsInfo {

    private long serId;
    private String shortName;
    private String validityDate;

    public ViewStudyExaminationRegulationsInfo() { }

    public ViewStudyExaminationRegulationsInfo(long serId, String shortName, String validityDate) {
        this.serId = serId;
        this.shortName = shortName;
        this.validityDate = validityDate;
    }

    public long getSerId() {
        return serId;
    }

    public void setSerId(long serId) {
        this.serId = serId;
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
