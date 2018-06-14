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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public int getFirstSemester() {
        return firstSemester;
    }

    public void setFirstSemester(int firstSemester) {
        this.firstSemester = firstSemester;
    }

    public int getLastSemester() {
        return lastSemester;
    }

    public void setLastSemester(int lastSemester) {
        this.lastSemester = lastSemester;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }
}
