package homework5.charger;

import homework5.battery.IChargeableBattery;

public class StandardCharger extends Charger {

    @Override
    protected void chargingProcess(IChargeableBattery chargeable) {
        chargeable.charge();
    }

}
