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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private CourseOfStudies course;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Footnote> footnotes= new ArrayList<Footnote>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<StudySection> studySections= new ArrayList<StudySection>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Paragraph> paragraphs = new ArrayList<Paragraph>();

    @Column(name = "version", nullable = true)
    private int version;

    @Column(name = "validityDate", nullable = true)
    private Date validityDate;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "foreword", nullable = true)
    private String foreword;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CourseOfStudies getCourse() {
        return course;
    }

    public void setCourse(CourseOfStudies course) {
        this.course = course;
    }

    public List<Footnote> getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(List<Footnote> footnotes) {
        this.footnotes = footnotes;
    }

    public List<StudySection> getStudySections() {
        return studySections;
    }

    public void setStudySections(List<StudySection> studySections) {
        this.studySections = studySections;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForeword() {
        return foreword;
    }

    public void setForeword(String foreword) {
        this.foreword = foreword;
    }
}
