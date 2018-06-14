package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ExamTypeDeclaration")
@Table(name = "EXAMTYPEDECLARATION")
public class ExamTypeDeclaration {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ExamType> examTypes = new ArrayList<ExamType>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    @Column(name = "unit", nullable = true)
    private String unit;

    //getter and setter

}
