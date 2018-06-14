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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }
}
