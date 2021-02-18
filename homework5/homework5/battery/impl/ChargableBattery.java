package homework5.battery.impl;

import homework5.battery.IChargeableBattery;

public abstract class ChargableBattery extends Battery implements IChargeableBattery {
    public ChargableBattery(int capacity) {
        super(capacity);
    }
}
