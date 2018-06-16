package de.hs_coburg.mgse.persistence.model;

import org.hibernate.jdbc.Work;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ModuleDescription")
@Table(name = "MODULEDESCRIPTION")
public class ModuleDescription {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleAdmissionRequirement> admissionRequirements = new ArrayList<ModuleAdmissionRequirement>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<Workload> workloads = new ArrayList<Workload>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Media> medias = new ArrayList<Media>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<Professor> lectures = new ArrayList<Professor>();

    @Column(name = "language", nullable = true)
    private String language;

    @Column(name = "prerequisite", nullable = true)
    private String prerequisite;

    @Column(name = "qualificationGoals", nullable = true)
    private String qualificationGoals;

    @Column(name = "content", nullable = true)
    private String content;

    @Column(name = "literature", nullable = true)
    private String literature;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ModuleAdmissionRequirement> getAdmissionRequirements() {
        return admissionRequirements;
    }

    public void setAdmissionRequirements(List<ModuleAdmissionRequirement> admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public List<Workload> getWorkloads() {
        return workloads;
    }

    public void setWorkloads(List<Workload> workloads) {
        this.workloads = workloads;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<Professor> getLectures() {
        return lectures;
    }

    public void setLectures(List<Professor> lectures) {
        this.lectures = lectures;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
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

    public String getLiterature() {
        return literature;
    }

    public void setLiterature(String literature) {
        this.literature = literature;
    }
}
