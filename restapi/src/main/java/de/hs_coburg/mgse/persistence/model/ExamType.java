package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "ExamType")
@Table(name = "EXAMTYPE")
public class ExamType {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "lowerBound", nullable = true)
    private int lowerBound;

    @Column(name = "upperBound", nullable = true)
    private int upperBound;
    //getter and setter

}
