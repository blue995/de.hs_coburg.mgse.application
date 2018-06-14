package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "StudySection")
@Table(name = "STUDYSECTION")
public class StudySection {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<Module> modules = new ArrayList<Module>();

    @Column(name = "firstSemester", nullable = true)
    private int firstSemester;

    @Column(name = "lastSemester", nullable = true)
    private int lastSemester;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    //getter and setter

}
