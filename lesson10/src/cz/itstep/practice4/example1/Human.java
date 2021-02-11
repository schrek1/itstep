package cz.itstep.practice4.example1;

import java.time.LocalDate;

public abstract class Human {
    private final String firstName;
    private final String lastName;
    private final LocalDate born;

    protected Human(String firstName, String lastName, LocalDate born) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.born = born;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBorn() {
        return born;
    }

    public String getHumanInfo() {
        return "Clovek:" + "\n" +
                "- jmeno: " + firstName + " " + lastName + "\n" +
                "- narozen: " + born;
    }

    public abstract String getJobInfo();
}
