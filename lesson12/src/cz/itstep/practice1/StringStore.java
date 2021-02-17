package cz.itstep.practice1;

import java.util.Arrays;

public class StringStore implements IShow {

    private final String[] strings;

    public StringStore(String[] strings) {
        this.strings = strings;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(strings));
    }

    @Override
    public void print(String info) {
        System.out.println(info + ":");
        print();
    }

    public String[] getStrings() {
        if (strings == null) return new String[0];
        return Arrays.copyOf(strings, strings.length);
    }
}
