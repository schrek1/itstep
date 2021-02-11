package cz.itstep.practice4.example1;

import java.time.LocalDate;

public class Pilot extends Human {
    private String planeTypeQualification;
    private int hoursTotal;

    public Pilot(String firstName, String lastName, LocalDate born, String planeTypeQualification, int hoursTotal) {
        super(firstName, lastName, born);
        this.planeTypeQualification = planeTypeQualification;
        this.hoursTotal = hoursTotal;
    }

    public String getPlaneTypeQualification() {
        return planeTypeQualification;
    }

    public void setPlaneTypeQualification(String planeTypeQualification) {
        this.planeTypeQualification = planeTypeQualification;
    }

    public int getHoursTotal() {
        return hoursTotal;
    }

    public void setHoursTotal(int hoursTotal) {
        this.hoursTotal = hoursTotal;
    }

    @Override
    public String getJobInfo() {
        return "Pilot:" +"\n"+
                "- opravneni na typ:" + planeTypeQualification + "\n" +
                "- pocet hodin:" + hoursTotal;
    }
}
