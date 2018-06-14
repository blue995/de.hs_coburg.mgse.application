package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "StudyExaminationRegulations")
@Table(name = "STUDYEXAMINATIONREGULATIONS")
public class StudyExaminationRegulations {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Footnote> footnotes= new ArrayList<Footnote>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<StudySection> studySections= new ArrayList<StudySection>();

    @Column(name = "version", nullable = true)
    private int version;

    @Column(name = "date", nullable = true)
    private Date date;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "foreword", nullable = true)
    private String foreword;

    //getter and setter
}
