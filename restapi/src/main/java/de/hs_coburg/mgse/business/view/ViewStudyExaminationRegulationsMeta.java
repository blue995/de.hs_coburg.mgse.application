package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewStudyExaminationRegulationsMeta {

    private String completeName;
    private List<ViewDegreeMeta> degrees;

    public ViewStudyExaminationRegulationsMeta() { }

    public ViewStudyExaminationRegulationsMeta(String completeName, List<ViewDegreeMeta> degrees) {
        this.completeName = completeName;
        this.degrees = degrees;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public List<ViewDegreeMeta> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<ViewDegreeMeta> degrees) {
        this.degrees = degrees;
    }
}
