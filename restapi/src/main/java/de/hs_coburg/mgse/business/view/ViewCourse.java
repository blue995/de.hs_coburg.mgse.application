package de.hs_coburg.mgse.business.view;

public class ViewCourse {

    private long id;
    private String courseOfStudy;
    private String moduleSpecification;
    private String abbreviation;
    private int semesterHours;
    private int ects;
    private String workload;
    private int semester;
    private String rota;
    private String duration;
    private String responsiblePerson;
    private String lecturer;
    private String language;
    private String admissionRequirements;
    private String prerequisites;
    private String qualificationGoals;
    private String content;
    private String examType;
    private String mediaType;
    private String literature;

    public ViewCourse() { }

    public ViewCourse(long id, String courseOfStudy, String moduleSpecification, String abbreviation, int semesterHours, int ects, String workload, int semester, String rota, String duration, String responsiblePerson, String lecturer, String language, String admissionRequirements, String prerequisites, String qualificationGoals, String content, String examType, String mediaType, String literature) {
        this.id = id;
        this.courseOfStudy = courseOfStudy;
        this.moduleSpecification = moduleSpecification;
        this.abbreviation = abbreviation;
        this.semesterHours = semesterHours;
        this.ects = ects;
        this.workload = workload;
        this.semester = semester;
        this.rota = rota;
        this.duration = duration;
        this.responsiblePerson = responsiblePerson;
        this.lecturer = lecturer;
        this.language = language;
        this.admissionRequirements = admissionRequirements;
        this.prerequisites = prerequisites;
        this.qualificationGoals = qualificationGoals;
        this.content = content;
        this.examType = examType;
        this.mediaType = mediaType;
        this.literature = literature;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public String getModuleSpecification() {
        return moduleSpecification;
    }

    public void setModuleSpecification(String moduleSpecification) {
        this.moduleSpecification = moduleSpecification;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(int semesterHours) {
        this.semesterHours = semesterHours;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAdmissionRequirements() {
        return admissionRequirements;
    }

    public void setAdmissionRequirements(String admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getQualificationGoals() {
        return qualificationGoals;
    }

    public void setQualificationGoals(String qualificationGoals) {
        this.qualificationGoals = qualificationGoals;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getLiterature() {
        return literature;
    }

    public void setLiterature(String literature) {
        this.literature = literature;
    }
}
