package homework5;

import homework5.battery.IBattery;
import homework5.charger.ICharger;
import homework5.charger.StandardCharger;
import homework5.falshlight.Flashlight;
import homework5.falshlight.IFlashlight;

public class Task1 {

    public static void main(String[] args) {
        IFlashlight flashlight = new Flashlight();


        while (flashlight.getBatteryCapacity() > 0) {
            flashlight.switchLight();
        }

        System.out.println("-> first end ");
        flashlight.switchLight();

        IBattery battery = flashlight.removeBattery();

        ICharger iCharger = new StandardCharger();

        do {
            iCharger.chargeBattery(battery);
        } while (!battery.isFullyCharged());


        System.out.println("-> second start ");
        flashlight.setBattery(battery);
        while (flashlight.getBatteryCapacity() > 0) {
            flashlight.switchLight();
        }

    }
}
