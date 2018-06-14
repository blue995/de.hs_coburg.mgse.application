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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
