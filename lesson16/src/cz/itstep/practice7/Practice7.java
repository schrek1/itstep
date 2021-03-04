package cz.itstep.practice7;

import java.util.Arrays;

public class Practice7 {

    public static <T extends Number> Number[] sortThem(T... numbers) {
        if (numbers == null || numbers.length == 0) {
            return new Number[0];
        }

        Arrays.sort(numbers);

        return numbers;
    }

    public static <T extends Number> boolean search(T[] numbers, T searched) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);

        return Arrays.binarySearch(numbers, searched) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortThem(10, 8, 1, 6, 9)));
        System.out.println(search(new Integer[]{10, 8, 1, 6, 9}, 99));
    }

}

