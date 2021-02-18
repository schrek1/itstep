package homework5.battery.impl;


public class ChinaBattery extends Battery {
    /*Task 3
    Create a homework5.battery.impl.ChinaBattery class of the Chinese battery.
    Add to the battery class:
    ■A class field for keeping the current charge: private int charge.
    ■The boolean charge() method that reduces the battery charge and returns true if the charge has been reduced and false if the battery has run down.
     Add a class property with the private:private homework5.battery.impl.ChinaBattery battery = new homework5.battery.impl.ChinaBattery();
     Add  the  use  of  battery  to  the  method  of  turning  on  the  flashlight.
     The test should remain in the green zone.*/

    public ChinaBattery() {
        super(5);
    }
}
