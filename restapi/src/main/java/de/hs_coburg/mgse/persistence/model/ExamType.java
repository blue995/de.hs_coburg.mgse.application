package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "ExamType")
@Table(name = "EXAMTYPE")
public class ExamType {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ExamType> examTypes = new ArrayList<ExamType>();
    */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private ExamTypeDeclaration examTypeDeclaration;

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

    public ExamTypeDeclaration getExamTypeDeclaration() {
        return examTypeDeclaration;
    }

    public void setExamTypeDeclaration(ExamTypeDeclaration examTypeDeclaration) {
        this.examTypeDeclaration = examTypeDeclaration;
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
