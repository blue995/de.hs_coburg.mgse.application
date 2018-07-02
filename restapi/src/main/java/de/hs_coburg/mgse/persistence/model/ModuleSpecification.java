package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ModuleSpecification")
@Table(name = "MODULESPECIFICATION")
public class ModuleSpecification {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleDescription> referencedBy = new ArrayList<ModuleDescription>();
    */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Professor> testers = new ArrayList<Professor>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Aid> aids = new ArrayList<Aid>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<CustomAid> customAids = new ArrayList<CustomAid>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Module module;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ConcreteExamType> concreteExamTypes = new ArrayList<ConcreteExamType>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<CourseTypeDeclaration> courseTypes = new ArrayList<CourseTypeDeclaration>();

    @Column(name = "semester", nullable = true)
    private Integer semester;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "rota", nullable = true)
    private String rota;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Professor> getTesters() {
        return testers;
    }

    public void setTesters(List<Professor> testers) {
        this.testers = testers;
    }

    /*
        public List<ModuleDescription> getReferencedBy() {
            return referencedBy;
        }

        public void setReferencedBy(List<ModuleDescription> referencedBy) {
            this.referencedBy = referencedBy;
        }
        */
    public List<Aid> getAids() {
        return aids;
    }

    public void setAids(List<Aid> aids) {
        this.aids = aids;
    }

    public List<CustomAid> getCustomAids() {
        return customAids;
    }

    public void setCustomAids(List<CustomAid> customAids) {
        this.customAids = customAids;
    }

    public GlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(GlossaryEntry details) {
        this.details = details;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public List<ConcreteExamType> getConcreteExamTypes() {
        return concreteExamTypes;
    }

    public void setConcreteExamTypes(List<ConcreteExamType> concreteExamTypes) {
        this.concreteExamTypes = concreteExamTypes;
    }

    public List<CourseTypeDeclaration> getCourseTypes() {
        return courseTypes;
    }

    public void setCourseTypes(List<CourseTypeDeclaration> courseTypes) {
        this.courseTypes = courseTypes;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
}
