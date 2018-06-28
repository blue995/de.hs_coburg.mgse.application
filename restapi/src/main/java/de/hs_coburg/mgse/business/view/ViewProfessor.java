package de.hs_coburg.mgse.business.view;

public class ViewProfessor {

    private String firstName;
    private String lastName;
    private String email;
    private String room;
    private String abbreviation;

    public ViewProfessor() { }

    public ViewProfessor(String firstName, String lastName, String email, String room, String abbreviation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.room = room;
        this.abbreviation = abbreviation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
