package cz.itstep.example;

import java.time.LocalDate;

public class BetterHuman {
    private final LocalDate dateOfBirth;
    private String name;
    private String phoneNumber;

    private Address address;

    public BetterHuman(String name, LocalDate dateOfBirth) {
        this(dateOfBirth);
        this.name = name;
    }

    private BetterHuman(LocalDate dateOfBirth) {
        name = "";
        this.dateOfBirth = dateOfBirth;
        phoneNumber = "";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isAddressSet() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
