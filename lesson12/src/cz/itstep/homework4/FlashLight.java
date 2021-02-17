package cz.itstep.homework4;

public class FlashLight implements FlashLightInterface {
    /*Task 2
    Create a Flashlight class.
    Add to the flashlight class:
    ■Methods of turning the flashlight on (void on()) and off (void off()).
    ■The boolean isLight() method that checks the state of the flashlight.
    ■The private boolean light class field that stores the current state of the flashlight.
    ■Implement an algorithm of turning the flashlight on and off.
    The test should be in the green zone.*/
    private boolean light = false;

    public void switchLight() {
        if(isLight()) {
            off();
            System.out.println("  \uD83D\uDCA1  ");

        }
        else {
            on();
            System.out.println("\uD83D\uDDE6\uD83D\uDCA1\uD83D\uDDE7");
        }
    }

    public void on() {
        this.light = true;
        System.out.println("Flashlight is turned on");
    }

    public void off() {
        this.light = false;
        System.out.println("Flashlight is turned off");
    }

    public boolean isLight() {
        if (light) {
            return true;
            }
        else {
            return false;
        }
    }
}

