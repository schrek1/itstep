package cz.itstep.algorithm;

public class Main {

    public static void main(String[] args) {

    }

    public void cartesian(int[] numbers) {
        int cartesianSum = 0;
        for (int first : numbers) {
            for (int second : numbers) {
                cartesianSum = first * second;
            }
        }
    }
}
