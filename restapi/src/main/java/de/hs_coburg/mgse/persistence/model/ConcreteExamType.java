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
    private Integer value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private ExamType examType;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
}
