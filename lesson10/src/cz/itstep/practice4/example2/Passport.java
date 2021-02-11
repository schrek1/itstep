package cz.itstep.practice4.example2;

import java.time.LocalDate;

public class Passport {
    private String firstName;
    private String lastName;
    private LocalDate born;
    private String country;

    public Passport(String firstName, String lastName, LocalDate born, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.born = born;
        this.country = country;
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

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
