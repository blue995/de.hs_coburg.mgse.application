package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewCurriculumEntry {

    private int semester;
    private String rota;
    private String moduleCompleteName;
    private String moduleAbbreviation;
    private int etcs;
    private int semesterHours;
    private List<ViewCourseType> moduleCourseTypes;
    private List<ViewExamType> moduleExamType;
    private List<String> aidList;
    private List<ViewProfessor> responsiblePersons;
    private List<ViewProfessor> testers;

    public ViewCurriculumEntry() { }

    public ViewCurriculumEntry(int semester, String rota, String moduleCompleteName, String moduleAbbreviation, int etcs, int semesterHours, List<ViewCourseType> moduleCourseTypes, List<ViewExamType> moduleExamType, List<String> aidList, List<ViewProfessor> responsiblePersons, List<ViewProfessor> testers) {
        this.semester = semester;
        this.rota = rota;
        this.moduleCompleteName = moduleCompleteName;
        this.moduleAbbreviation = moduleAbbreviation;
        this.etcs = etcs;
        this.semesterHours = semesterHours;
        this.moduleCourseTypes = moduleCourseTypes;
        this.moduleExamType = moduleExamType;
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

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
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

    public List<ViewExamType> getModuleExamType() {
        return moduleExamType;
    }

    public void setModuleExamType(List<ViewExamType> moduleExamType) {
        this.moduleExamType = moduleExamType;
    }

    public List<String> getAidList() {
        return aidList;
    }

    public void setAidList(List<String> aidList) {
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
}
