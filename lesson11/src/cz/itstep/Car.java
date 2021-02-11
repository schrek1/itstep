package cz.itstep;

class Car {
    private final String type;
    private final String color;

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    protected Car clone() {
        return new Car(type, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
