package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewStudySection {

    private String completeName;
    private int firstSemester;
    private int lastSemester;
    private int sumOfEcts;
    private int sumOfSemesterHours;
    private double sumOfQuantifiers;
    private List<ViewModuleType> moduleTypes;

    public ViewStudySection() { }

    public ViewStudySection(String completeName, int firstSemester, int lastSemester, int sumOfEcts, int sumOfSemesterHours, int sumOfQuantifiers, List<ViewModuleType> moduleTypes) {
        this.completeName = completeName;
        this.firstSemester = firstSemester;
        this.lastSemester = lastSemester;
        this.sumOfEcts = sumOfEcts;
        this.sumOfSemesterHours = sumOfSemesterHours;
        this.sumOfQuantifiers = sumOfQuantifiers;
        this.moduleTypes = moduleTypes;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getFirstSemester() {
        return firstSemester;
    }

    public void setFirstSemester(int firstSemester) {
        this.firstSemester = firstSemester;
    }

    public int getLastSemester() {
        return lastSemester;
    }

    public void setLastSemester(int lastSemester) {
        this.lastSemester = lastSemester;
    }

    public int getSumOfEcts() {
        return sumOfEcts;
    }

    public void setSumOfEcts(int sumOfEcts) {
        this.sumOfEcts = sumOfEcts;
    }

    public int getSumOfSemesterHours() {
        return sumOfSemesterHours;
    }

    public void setSumOfSemesterHours(int sumOfSemesterHours) {
        this.sumOfSemesterHours = sumOfSemesterHours;
    }

    public double getSumOfQuantifiers() {
        return sumOfQuantifiers;
    }

    public void setSumOfQuantifiers(double sumOfQualifiers) {
        this.sumOfQuantifiers = sumOfQualifiers;
    }

    public List<ViewModuleType> getModuleTypes() {
        return moduleTypes;
    }

    public void setModuleTypes(List<ViewModuleType> moduleTypes) {
        this.moduleTypes = moduleTypes;
    }
}
