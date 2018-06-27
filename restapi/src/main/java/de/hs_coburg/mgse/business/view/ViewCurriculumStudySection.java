package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewCurriculumStudySection {

    private String completeName;
    private List<ViewStudySubsectionType> subsectionTypes;

    public ViewCurriculumStudySection() { }

    public ViewCurriculumStudySection(String completeName, List<ViewStudySubsectionType> subsectionTypes) {
        this.completeName = completeName;
        this.subsectionTypes = subsectionTypes;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public List<ViewStudySubsectionType> getSubsectionTypes() {
        return subsectionTypes;
    }

    public void setSubsectionTypes(List<ViewStudySubsectionType> subsectionTypes) {
        this.subsectionTypes = subsectionTypes;
    }
}
