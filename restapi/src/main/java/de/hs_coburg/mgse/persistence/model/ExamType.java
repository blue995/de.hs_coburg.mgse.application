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
    private Integer lowerBound;

    @Column(name = "upperBound", nullable = true)
    private Integer upperBound;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }
}
