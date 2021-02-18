package homework5.charger;

import homework5.battery.IBattery;
import homework5.battery.IChargeableBattery;

public abstract class Charger implements ICharger {

    @Override
    public void chargeBattery(IBattery battery) {
        if (battery == null) {
            System.out.println("Battery shouldn't be null..");
        }

        if (battery instanceof IChargeableBattery) {
            IChargeableBattery chargeable = (IChargeableBattery) battery;
            chargingProcess(chargeable);
        } else {
            System.out.println("Battery unable for charging!");
        }
    }

    protected abstract void chargingProcess(IChargeableBattery chargeable);
}
