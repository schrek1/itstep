package cz.itstep.practice4.example2;

import java.time.LocalDate;

public class ForeignPassport extends Passport {
    private String[] visas;
    private String passportNumber;

    public ForeignPassport() {
        super("", "", null, "");
    }

    public ForeignPassport(String firstName,
                           String lastName,
                           LocalDate born,
                           String country,
                           String[] visas,
                           String passportNumber
    ) {
        super(firstName, lastName, born, country);
        this.visas = visas;
        this.passportNumber = passportNumber;
    }

    public String[] getVisas() {
        return visas;
    }

    public void setVisas(String[] visas) {
        this.visas = visas;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
