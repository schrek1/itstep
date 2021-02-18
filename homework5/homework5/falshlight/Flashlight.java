package homework5.falshlight;

import homework5.battery.IBattery;
import homework5.battery.impl.ChinaBattery;

public class Flashlight implements IFlashlight {

    private boolean isLighting = false;
    private IBattery battery;

    public Flashlight() {
        this.battery = new ChinaBattery();
    }

    public Flashlight(IBattery battery) {
        this.battery = battery;
    }

    @Override
    public void setBattery(IBattery battery) {
        this.battery = battery;
    }

    @Override
    public int getBatteryCapacity() {
        return battery.getActualCapacity();
    }

    @Override
    public IBattery removeBattery() {
        IBattery removed = battery;
        battery = null;
        return removed;
    }

    @Override
    public void switchLight() {
        if (isLighting()) {
            isLighting = false;
            System.out.println("  \uD83D\uDCA1 ");
        } else {
            if (battery.getPower()) {
                isLighting = true;
                System.out.println("\uD83D\uDDE6\uD83D\uDCA1\uD83D\uDDE7");
            } else {
                System.out.println("battery is exhausted...");
            }
        }
    }

    @Override
    public boolean isLighting() {
        return isLighting;
    }
}
