package cz.itstep.practice4.example1;

import java.time.LocalDate;

public class Sailor extends Human {
    private String shipName;

    public Sailor(String firstName, String lastName, LocalDate born, String shipName) {
        super(firstName, lastName, born);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String getJobInfo() {
        return "Namornik:" + "\n"+
                "- lod:" + shipName;
    }
}
