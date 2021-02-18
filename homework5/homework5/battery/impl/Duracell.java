package homework5.battery.impl;


public class Duracell extends Battery {
    /*
    Task 1
     A new type of battery (homework5.battery.impl.Duracell), which works 10 times longer than a usual Chinese battery, has appeared.
     Rewrite  the  flashlight  class  so  that  it  is  possible  to  check  the  flashlight  with  different  types  of  batteries
     (enter  an  abstraction  for the concept of battery and add a constructor to the flashlight class to work with the battery abstraction).
     Add tests for the flashlight with a new battery.
     */

    public Duracell() {
        super(10);
    }
}
