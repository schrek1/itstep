package homework5.falshlight;

import homework5.battery.IBattery;

public interface IFlashlight {

    boolean isLighting();

    void switchLight();

    void setBattery(IBattery battery);

    int getBatteryCapacity();

    IBattery removeBattery();
}
