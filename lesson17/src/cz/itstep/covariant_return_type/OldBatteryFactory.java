package cz.itstep.covariant_return_type;

public class OldBatteryFactory implements BatteryFactory {

    @Override
    public Battery productBattery() {
        return new Battery();
    }
}
