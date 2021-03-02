package cz.itstep.practice;

public class Practice2 {

    public static <T extends Number> Number max(T... numbers) {
        if (numbers == null || numbers.length == 0) return null;

        double max = Double.MIN_VALUE;

        for (Number number : numbers) {
            double value = number.doubleValue();
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Number intMax = max(5, 1, 3, 5);
        System.out.println(intMax);

        Number decMax = max(5.0, 3.5, 7.5);
        System.out.println(decMax);
    }
}
