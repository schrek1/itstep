package cz.itstep;

public class Practice3 {
    public static void main(String[] args) {
        double max = max(new double[]{1, 2, 3, 4});
        max = max(1, 2, 3, 4, 5, 8, 9);
        max = max(1, 2, 3);
        System.out.println(max);
    }


//    public static double max(double[] values) {
//        double actualMaximum = Double.MIN_VALUE;
//        for (double value : values) {
//            if (value >= actualMaximum) {
//                actualMaximum = value;
//            }
//        }
//        return actualMaximum;
//    }

    public static double max(double... values) {
        double actualMaximum = Double.MIN_VALUE;
        for (double value : values) {
            if (value >= actualMaximum) {
                actualMaximum = value;
            }
        }
        return actualMaximum;
    }

    public static int max(int... values) {
        int actualMaximum = Integer.MIN_VALUE;
        for (int value : values) {
            if (value >= actualMaximum) {
                actualMaximum = value;
            }
        }
        return actualMaximum;
    }
}
