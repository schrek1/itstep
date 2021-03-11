package cz.itstep.covariant_return_type;

public class Main {


    public static void main(String[] args) {
        final OldBatteryFactory oldBatteryFactory = new OldBatteryFactory();
        final Battery battery = oldBatteryFactory.productBattery();

        final ImprovedBatteryFactory improvedBatteryFactory = new ImprovedBatteryFactory();
        final AlcalicBattery alcalicBattery = (AlcalicBattery) improvedBatteryFactory.productBattery();

    }

}
