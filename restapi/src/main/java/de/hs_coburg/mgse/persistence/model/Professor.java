package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Professor")
@Table(name = "PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "firstName", nullable = true)
    private String firstName;

    @Column(name = "middleName", nullable = true)
    private String middleName;

    @Column(name = "lastName", nullable = true)
    private String lastName;

    @Column(name = "room", nullable = true)
    private String room;

    @Column(name = "email", nullable = true)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry abbreviation;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleDescription> responsibleForModules = new ArrayList<ModuleDescription>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleDescription> lectures = new ArrayList<ModuleDescription>();

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GlossaryEntry getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(GlossaryEntry abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<ModuleDescription> getResponsibleForModules() {
        return responsibleForModules;
    }

    public void setResponsibleForModules(List<ModuleDescription> responsibleForModules) {
        this.responsibleForModules = responsibleForModules;
    }

    public List<ModuleDescription> getLectures() {
        return lectures;
    }

    public void setLectures(List<ModuleDescription> lectures) {
        this.lectures = lectures;
    }
}
