package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewDegreeMeta {

    private String completeName;
    private List<ViewStudyExaminationRegulationsInfo> sers;
    private List<ViewCourseCatalogue> courseCatalogues;
    private List<ViewCurriculumInfo> curricula;

    public ViewDegreeMeta() { }

    public ViewDegreeMeta(String completeName, List<ViewStudyExaminationRegulationsInfo> sers, List<ViewCourseCatalogue> courseCatalogues, List<ViewCurriculumInfo> curricula) {
        this.completeName = completeName;
        this.sers = sers;
        this.courseCatalogues = courseCatalogues;
        this.curricula = curricula;
    }


    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public List<ViewStudyExaminationRegulationsInfo> getSers() {
        return sers;
    }

    public void setSers(List<ViewStudyExaminationRegulationsInfo> sers) {
        this.sers = sers;
    }

    public List<ViewCourseCatalogue> getCourseCatalogues() {
        return courseCatalogues;
    }

    public void setCourseCatalogues(List<ViewCourseCatalogue> courseCatalogues) {
        this.courseCatalogues = courseCatalogues;
    }

    public List<ViewCurriculumInfo> getCurricula() {
        return curricula;
    }

    public void setCurricula(List<ViewCurriculumInfo> curricula) {
        this.curricula = curricula;
    }
}
