package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Curriculum")
@Table(name = "CURRICULUM")
public class Curriculum {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();

    @Column(name = "version", nullable = true)
    private int version;

    @Column(name = "semester", nullable = true)
    private String semester;

    @Column(name = "year", nullable = true)
    private int year;

    @Column(name = "date", nullable = true)
    private Date date;

    //getter and setter

}
