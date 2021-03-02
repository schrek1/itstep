package cz.itstep.homework3;

import java.io.IOException;

public class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        String errorDescription = null;

        if (a + b < c) {
            errorDescription = "a + b < c";
        } else if (b + c < a) {
            errorDescription = "b + c < a";
        } else if (c + a < b) {
            errorDescription = "c + a < b";
        }

        if (errorDescription != null) {
            throw new IllegalArgumentException(String.format("Unable construct triangle - %s", errorDescription));
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
}
