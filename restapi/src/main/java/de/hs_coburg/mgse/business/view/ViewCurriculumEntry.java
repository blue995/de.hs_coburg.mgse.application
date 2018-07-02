package de.hs_coburg.mgse.business.view;

import java.util.List;
import java.util.Objects;

public class ViewCurriculumEntry {

    private int semester;
    private String rota;
    private String moduleCompleteName;
    private String moduleAbbreviation;
    private int ects;
    private int semesterHours;
    private List<ViewCourseType> moduleCourseTypes;
    private List<ViewExamType> moduleExamTypes;
    private String aidList;
    private List<ViewProfessor> responsiblePersons;
    private List<ViewProfessor> testers;

    public ViewCurriculumEntry() { }

    public ViewCurriculumEntry(int semester, String rota, String moduleCompleteName, String moduleAbbreviation, int ects, int semesterHours, List<ViewCourseType> moduleCourseTypes, List<ViewExamType> moduleExamTypes, String aidList, List<ViewProfessor> responsiblePersons, List<ViewProfessor> testers) {
        this.semester = semester;
        this.rota = rota;
        this.moduleCompleteName = moduleCompleteName;
        this.moduleAbbreviation = moduleAbbreviation;
        this.ects = ects;
        this.semesterHours = semesterHours;
        this.moduleCourseTypes = moduleCourseTypes;
        this.moduleExamTypes = moduleExamTypes;
        this.aidList = aidList;
        this.responsiblePersons = responsiblePersons;
        this.testers = testers;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getModuleCompleteName() {
        return moduleCompleteName;
    }

    public void setModuleCompleteName(String moduleCompleteName) {
        this.moduleCompleteName = moduleCompleteName;
    }

    public String getModuleAbbreviation() {
        return moduleAbbreviation;
    }

    public void setModuleAbbreviation(String moduleAbbreviation) {
        this.moduleAbbreviation = moduleAbbreviation;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int etcs) {
        this.ects = etcs;
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(int semesterHours) {
        this.semesterHours = semesterHours;
    }

    public List<ViewCourseType> getModuleCourseTypes() {
        return moduleCourseTypes;
    }

    public void setModuleCourseTypes(List<ViewCourseType> moduleCourseTypes) {
        this.moduleCourseTypes = moduleCourseTypes;
    }

    public List<ViewExamType> getModuleExamTypes() {
        return moduleExamTypes;
    }

    public void setModuleExamTypes(List<ViewExamType> moduleExamTypes) {
        this.moduleExamTypes = moduleExamTypes;
    }

    public String getAidList() {
        return aidList;
    }

    public void setAidList(String aidList) {
        this.aidList = aidList;
    }

    public List<ViewProfessor> getResponsiblePersons() {
        return responsiblePersons;
    }

    public void setResponsiblePersons(List<ViewProfessor> responsiblePersons) {
        this.responsiblePersons = responsiblePersons;
    }

    public List<ViewProfessor> getTesters() {
        return testers;
    }

    public void setTesters(List<ViewProfessor> testers) {
        this.testers = testers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewCurriculumEntry that = (ViewCurriculumEntry) o;
        return Objects.equals(moduleAbbreviation, that.moduleAbbreviation);
    }

    @Override
    public int hashCode() {

        return Objects.hash(moduleAbbreviation);
    }
}
