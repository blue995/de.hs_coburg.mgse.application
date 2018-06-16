package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "CustomAid")
@Table(name = "CUSTOMAID")
public class CustomAid {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    //getter and setter

}
