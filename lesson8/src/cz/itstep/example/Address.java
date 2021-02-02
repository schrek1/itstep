package cz.itstep.example;

public class Address {
    private final String streetName;
    private final String houseNumber;
    private final String city;
    private final String country;
    private final String postalCode;

    public Address(String streetName, String houseNumber, String city) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        country = "Czech";
        postalCode = "";
    }

    public Address(String streetName, String houseNumber, String city, String country, String postalCode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }


    public String getStreetName() {
        return streetName;
    }


    public String getHouseNumber() {
        return houseNumber;
    }


    public String getCity() {
        return city;
    }


    public String getCountry() {
        return country;
    }


    public String getPostalCode() {
        return postalCode;
    }


    // Address patch + old Address (this) => updated address

    public static Address copy(Address source, Address patch) {
        if (source == null) {
            return null;
        }

        String streetName = patch != null && patch.getStreetName() != null ? patch.getStreetName() : source.getStreetName();
        String houseNumber = patch != null && patch.getHouseNumber() != null ? patch.getHouseNumber() : source.getHouseNumber();
        String city = patch != null && patch.getCity() != null ? patch.getCity() : source.getCity();
        String country = patch != null && patch.getCountry() != null ? patch.getCountry() : source.getCountry();
        String postalCode = patch != null && patch.getPostalCode() != null ? patch.getPostalCode() : source.getPostalCode();

        return new Address(
                streetName,
                houseNumber,
                city,
                country,
                postalCode
        );
    }

    public Address copy(Address patch) {
        String streetName = patch != null && patch.getStreetName() != null ? patch.getStreetName() : this.streetName;
        String houseNumber = patch != null && patch.getHouseNumber() != null ? patch.getHouseNumber() : this.houseNumber;
        String city = patch != null && patch.getCity() != null ? patch.getCity() : this.city;
        String country = patch != null && patch.getCountry() != null ? patch.getCountry() : this.country;
        String postalCode = patch != null && patch.getPostalCode() != null ? patch.getPostalCode() : this.postalCode;

        return new Address(
                streetName,
                houseNumber,
                city,
                country,
                postalCode
        );
    }

}
