package cz.itstep.model;

public class City {
    private String name;
    private String region;
    private String country;
    private long residentsCount;
    private String postCode;
    private String areaCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getResidentsCount() {
        return residentsCount;
    }

    public void setResidentsCount(long residentsCount) {
        this.residentsCount = residentsCount;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
