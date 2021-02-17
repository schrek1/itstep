package cz.itstep.practice2;

import java.util.Arrays;
import java.util.Comparator;

public class Array implements IMath, ISortable {
    private int[] array;

    public Array(int[] array) {
        this.array = array != null ? array : new int[0];
    }

    @Override
    public int max() {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    @Override
    public int min() {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    @Override
    public float avg() {
        float sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    @Override
    public Integer[] sortAsc() {
        return sortArray(array, true);
    }

    @Override
    public Integer[] sortDesc() {
        return sortArray(array, false);
    }

    private Integer[] sortArray(int[] array, boolean asc) {
        if (array == null) return new Integer[0];
        Integer[] ints = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(ints, asc ? Comparator.nullsLast(Comparator.naturalOrder()) : Comparator.nullsFirst(Comparator.reverseOrder()));
        return ints;
    }
}
