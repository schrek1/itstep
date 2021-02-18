package homework5.charger;

import homework5.battery.IChargeableBattery;

public class SuperCharger extends Charger {

    @Override
    protected void chargingProcess(IChargeableBattery chargeable) {

        chargeable.charge();
        chargeable.charge();
    }

}
