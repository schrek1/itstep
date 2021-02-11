package cz.itstep.practice4.example1;

import java.time.LocalDate;

public class Builder extends Human {
    private int yearOfPractice;
    private String specialization;
    private int countOfBuild;

    public Builder(String firstName, String lastName, LocalDate born, int yearOfPractice, String specialization, int countOfBuild) {
        super(firstName, lastName, born);
        this.yearOfPractice = yearOfPractice;
        this.specialization = specialization;
        this.countOfBuild = countOfBuild;
    }

    public int getYearOfPractice() {
        return yearOfPractice;
    }

    public void setYearOfPractice(int yearOfPractice) {
        this.yearOfPractice = yearOfPractice;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCountOfBuild() {
        return countOfBuild;
    }

    public void incrementCountOfBuild() {
        this.countOfBuild++;
    }

    @Override
    public String getJobInfo() {
        return "Stavebnik:" + "\n" +
                "- specializace:" + specialization + "\n" +
                "- pocet staveb:" + countOfBuild + "\n" +
                "- pocet let praxe:" + yearOfPractice;
    }
}
