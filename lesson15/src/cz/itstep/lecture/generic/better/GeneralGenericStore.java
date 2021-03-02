package cz.itstep.lecture.generic.better;

import java.util.Arrays;
import java.util.Comparator;

public class GeneralGenericStore<T> {

    private final T[] items;

    public GeneralGenericStore(T[] items) {
        this.items = items;
    }

    public T[] sortItems(Comparator<T> comparator) {
        if (items == null) return null;
        Arrays.sort(items, comparator);
        return Arrays.copyOf(items, items.length);
    }

    public T[] getItems() {
        if (items == null) return null;
        return Arrays.copyOf(items, items.length);
    }
}
