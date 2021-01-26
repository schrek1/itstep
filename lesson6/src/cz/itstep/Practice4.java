package cz.itstep;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        printSorted(new int[]{8, 2, 3, 11, 15, 0, 1, 7});
        printSorted(new char[]{'z', 'a', 'y', 'e', 'i', 'j', '@', 'x', 'A'});
        printSorted(new String[]{"z", "a", "y", "e", "i", "j", "@", "x", "A"});
    }

    public static void printSorted(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int maxIndex = i;

            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }

            int tmp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = tmp;
        }

        System.out.println(Arrays.toString(numbers));
    }

    public static void printSorted(char[] chars) {
        for (int i = chars.length - 1; i >= 0; i--) {
            int maxIndex = i;

            for (int j = 0; j < i; j++) {
                if (chars[j] - chars[maxIndex] > 0) {
                    maxIndex = j;
                }
            }
            char tmp = chars[i];
            chars[i] = chars[maxIndex];
            chars[maxIndex] = tmp;
        }

        System.out.println(Arrays.toString(chars));
    }

    public static void printSorted(String[] strings) {
        for (int i = strings.length - 1; i >= 0; i--) {
            int maxIndex = i;

            for (int j = 0; j < i; j++) {
                if (strings[j] != null && strings[j].compareTo(strings[maxIndex]) > 0) maxIndex = j;
            }
            String tmp = strings[i];
            strings[i] = strings[maxIndex];
            strings[maxIndex] = tmp;
        }

        System.out.println(Arrays.toString(strings));
    }
}
