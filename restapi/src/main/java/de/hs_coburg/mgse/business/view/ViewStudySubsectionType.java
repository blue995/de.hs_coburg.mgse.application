package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewStudySubsectionType {

    private String subsectionTypeName;
    private List<ViewCurriculumEntry> curriculumEntries;

    public ViewStudySubsectionType() { }

    public ViewStudySubsectionType(String subsectionTypeName, List<ViewCurriculumEntry> curriculumEntries) {
        this.subsectionTypeName = subsectionTypeName;
        this.curriculumEntries = curriculumEntries;
    }

    public String getSubsectionTypeName() {
        return subsectionTypeName;
    }

    public void setSubsectionTypeName(String subsectionTypeName) {
        this.subsectionTypeName = subsectionTypeName;
    }

    public List<ViewCurriculumEntry> getCurriculumEntries() {
        return curriculumEntries;
    }

    public void setCurriculumEntries(List<ViewCurriculumEntry> curriculumEntries) {
        this.curriculumEntries = curriculumEntries;
    }
}
