package homework5.battery.impl;

import homework5.battery.IBattery;

abstract class Battery implements IBattery {

    private final int maxCapacity;
    protected int actualCapacity;

    public Battery(int capacity) {
        this.maxCapacity = capacity;
        this.actualCapacity = capacity;
    }

    public boolean getPower() {
        if (actualCapacity > 0) {
            this.actualCapacity--;
            return true;
        } else {
            return false;
        }
    }

    public int getActualCapacity() {
        return this.actualCapacity;
    }

    @Override
    public boolean isFullyCharged() {
        return maxCapacity == actualCapacity;
    }
}
