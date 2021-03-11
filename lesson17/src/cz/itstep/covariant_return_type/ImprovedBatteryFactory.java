package cz.itstep.covariant_return_type;

public class ImprovedBatteryFactory implements BatteryFactory {

    @Override
    public AlcalicBattery productBattery() {
        return new AlcalicBattery();
    }

}
