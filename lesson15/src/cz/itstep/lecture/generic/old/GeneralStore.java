package cz.itstep.lecture.generic.old;

import java.util.Arrays;
import java.util.Comparator;

public class GeneralStore {

    private final Object[] items;

    public GeneralStore(Object[] items) {
        this.items = items;
    }

    public Object[] sortItems(Comparator comparator) {
        if (items == null) return new Object[0];
        Arrays.sort(items, comparator);
        return Arrays.copyOf(items, items.length);
    }

    public Object[] getItems() {
        if (items == null) return new Object[0];
        return Arrays.copyOf(items, items.length);
    }
}
