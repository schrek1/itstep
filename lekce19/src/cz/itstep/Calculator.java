package cz.itstep;

public class Calculator {

    public double memory = 0;

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public void setMemory(double a) {
        memory = a;
    }

    public void addMemory(double a) {
        memory += a;
    }

    public double getMemory() {
        return memory;
    }
}
