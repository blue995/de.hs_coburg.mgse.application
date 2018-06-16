package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "ConcreteExamType")
@Table(name = "CONCRETEEXAMTYPE")
public class ConcreteExamType {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "value", nullable = true)
    private int value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private ExamType examType;

    //getter and setter

}
