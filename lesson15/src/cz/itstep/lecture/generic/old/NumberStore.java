package cz.itstep.lecture.generic.old;

import java.util.Arrays;

public class NumberStore implements IShow {

    private final int[] numbers;

    public NumberStore(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public void print(String info) {
        System.out.println(info + ":");
        print();
    }

    public int[] getNumbers() {
        if (numbers == null) return new int[0];
        return Arrays.copyOf(numbers, numbers.length);
    }
}
