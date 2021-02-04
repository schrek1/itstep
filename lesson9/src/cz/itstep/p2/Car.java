package cz.itstep.p2;

public class Car {

    // car name, manufacturer, manufacture year - immutables
    //engine capacity - mutable

    // 2 constructors
    // all immutables
    // all attributes

    // getters
    // setter

    // method return string in format
    // Car:
    // - <propertyName> = <propertyValue>
    // - <propertyName> = <propertyValue>
    // ...

    // create two instances:
    // c1 -> one with required properties
    // c2 -> one with all properties

    // actions:
    // print internal state of c1, c2
    // set c1 engine capacity
    // print internal state of c1

    private static int counter = 0;

    static {
        counter = 0;
    }

    private final String carName;
    private final String manufacturer;
    private final int manufacturedYear;
    private double engineCapacity;
    private int seats;

    public Car(String carName, String manufacturer, int manufacturedYear) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
        counter++;
    }

    public Car(String carName, String manufacturer, int manufacturedYear, double engineCapacity) {
        this(carName, manufacturer, manufacturedYear);
        this.engineCapacity = engineCapacity;
    }

    public Car(String carName, String manufacturer, int manufacturedYear, double engineCapacity, int seats) {
        this(carName, manufacturer, manufacturedYear, engineCapacity);
        this.seats = seats;
    }

    // GETTERY
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    // SETTERY
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "Car's name = " + carName + "\n" +
                "Manufacturer = " + manufacturer + "\n" +
                "Year of manufacture = " + manufacturedYear + "\n" +
                "Engine capacity = " + engineCapacity + "l\n";
    }
}

