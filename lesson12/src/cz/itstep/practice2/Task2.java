package cz.itstep.practice2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        System.out.println(array.max());
        System.out.println(array.min());
        System.out.println(array.avg());

        IMath math = array;

        System.out.println(math.max());
        System.out.println(math.min());
        System.out.println(math.avg());

        System.out.println(Arrays.toString(array.sortAsc()));
        System.out.println(Arrays.toString(array.sortDesc()));
    }
}
