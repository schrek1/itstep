package cz.itstep.homework;

import java.util.ArrayList;

public class MyArrayList<T> {

    private Object[] items;

    private int actualSize;

    public MyArrayList() {
        items = new Object[10];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) items = new Object[capacity];
        if (capacity == 0) new MyArrayList<T>();
        throw new IllegalArgumentException("Capacity must be positive");
    }


    /**
     * add to list
     *
     * @param item new item
     * @return index of inserted item
     */
    public int addItem(T item) {
        items[actualSize] = item;
        return actualSize++;
    }

    /**
     * get item in position <0;size)
     *
     * @param position valid index in list
     * @return item when found, otherwise null
     */
    public T getItem(int position) {
        if (position < 0 || position >= actualSize) return null;
        return (T) items[position];
    }

    /**
     * get size of list
     *
     * @return integer
     */
    public int size() {
        return actualSize;
    }
}
