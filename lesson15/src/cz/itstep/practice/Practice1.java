package cz.itstep.practice;

public class Practice1<T extends Number> {

    public Number max(T first, T second, T third) {
        double f = first.doubleValue();
        double s = second.doubleValue();
        double t = third.doubleValue();

        if (f > s) {
            return Math.max(f, t);
        } else {
            return Math.max(s, t);
        }
    }

    public static void main(String[] args) {
        Number intMax = new Practice1<Integer>().max(5, 7, 9);
        System.out.println(intMax);
        Number doubleMax = new Practice1<Double>().max(5.0, 7.0, 9.0);
        System.out.println(doubleMax);
    }
}
