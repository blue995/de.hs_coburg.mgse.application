package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewStudySubsectionType {

    private String subjectionTypeName;
    private List<ViewCurriculumEntry> curriculumEntries;

    public ViewStudySubsectionType() { }

    public ViewStudySubsectionType(String subjectionTypeName, List<ViewCurriculumEntry> curriculumEntries) {
        this.subjectionTypeName = subjectionTypeName;
        this.curriculumEntries = curriculumEntries;
    }

    public String getSubjectionTypeName() {
        return subjectionTypeName;
    }

    public void setSubjectionTypeName(String subjectionTypeName) {
        this.subjectionTypeName = subjectionTypeName;
    }

    public List<ViewCurriculumEntry> getCurriculumEntries() {
        return curriculumEntries;
    }

    public void setCurriculumEntries(List<ViewCurriculumEntry> curriculumEntries) {
        this.curriculumEntries = curriculumEntries;
    }
}
