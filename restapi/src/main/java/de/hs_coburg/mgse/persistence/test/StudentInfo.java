package de.hs_coburg.mgse.persistence.test;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="STUDENT_INFO")
public class StudentInfo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_no")
    private int rollNo;
    @Column(name = "name")
    private String name;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

