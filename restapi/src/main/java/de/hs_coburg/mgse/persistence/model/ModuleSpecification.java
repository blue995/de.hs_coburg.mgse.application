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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Aid> aids = new ArrayList<Aid>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<CustomAid> customAids = new ArrayList<CustomAid>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ConcreteExamType> concreteExamTypes = new ArrayList<ConcreteExamType>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<CourseTypeDeclaration> courseTypes = new ArrayList<CourseTypeDeclaration>();

    @Column(name = "semester", nullable = true)
    private int semester;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    //getter and setter

}
