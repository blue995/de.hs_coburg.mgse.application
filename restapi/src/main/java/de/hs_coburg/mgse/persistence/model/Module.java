package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Module")
@Table(name = "MODULE")
public class Module {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<CourseTypeDeclaration> courseType = new ArrayList<CourseTypeDeclaration>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ExamType> examTypes = new ArrayList<ExamType>();

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "ects", nullable = true)
    private int ects;

    @Column(name = "quantifier", nullable = true)
    private int quantifier;

    @Column(name = "semesterHours", nullable = true)
    private int semesterHours;

    //getter and setter

}
