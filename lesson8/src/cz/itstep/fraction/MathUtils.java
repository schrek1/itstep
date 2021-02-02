package cz.itstep.fraction;

public class MathUtils {

    public static int greatestCommonDivisor(int first, int second) {
        if (second == 0) {
            return first;
        }
        return greatestCommonDivisor(second, first % second);
    }

    public static int lowestCommonMultiple(int first, int second) {
        if (first == 0 || second == 0) {
            return 0;
        }
        int greatestCommonDivisor = greatestCommonDivisor(first, second);
        return (first * second) / greatestCommonDivisor;
    }


}
