package homework5.battery.impl;


import homework5.battery.IChargeableBattery;

public class Accumulator extends ChargableBattery {
    /*Task 2
    A  new  battery  (accumulator)  has  appeared,  which  can  be  removed   from   the   flashlight,   charged,
       and   reinserted   into   the  flashlight.  The  maximum  accumulator  charge  is  70  units.
         Accumulators, unlike batteries, let you know your current charge on a small screen.
         Add  tests  for  the  flashlight  with  the  accumulator  and  the  accumulator itself.
     */

    public Accumulator() {
        super(70);
    }

    public void recharge() {
        // jak se dostanu do proměnné charge v homework5.Battery, který je private v této metodě a zároveň, aby se z třídy homework5.Task1 nedali setovat charge baterie?
    }

    @Override
    public void charge() {
        actualCapacity++;
    }
}
