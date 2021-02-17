package cz.itstep.homework4;

public class ChinaBattery implements ChinaBatteryInterface {
    /*Task 3
    Create a ChinaBattery class of the Chinese battery.
    Add to the battery class:
    ■A class field for keeping the current charge: private int charge.
    ■The boolean charge() method that reduces the battery charge and returns true if the charge has been reduced and false if the battery has run down.
     Add a class property with the private:private ChinaBattery battery = new ChinaBattery();
     Add  the  use  of  battery  to  the  method  of  turning  on  the  flashlight.
     The test should remain in the green zone.*/
    private int charge = 5;

    public boolean charge() {
        this.charge--;
        if (charge > 0) {
            return true;
        } else {
            return false;
        }
    }
}
