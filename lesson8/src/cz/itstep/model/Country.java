package cz.itstep.model;

public class Country {
    private String countryName;
    private String continentName;
    private long residentsCount;
    private String telephoneCountryCode;
    private String postCode;
    private String capitalName;
    private String[] cityNames;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public long getResidentsCount() {
        return residentsCount;
    }

    public void setResidentsCount(long residentsCount) {
        this.residentsCount = residentsCount;
    }

    public String getTelephoneCountryCode() {
        return telephoneCountryCode;
    }

    public void setTelephoneCountryCode(String telephoneCountryCode) {
        this.telephoneCountryCode = telephoneCountryCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }
}
