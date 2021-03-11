package cz.itstep.pratice.common;

import java.util.Optional;

public class Item<T> {
    private T value;

    private Item<T> next;

    public Item(T value, Item<T> next) {
        this.value = value;
        this.next = next;
    }

    public Optional<T> getValue() {
        return Optional.ofNullable(value);
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Item<T> getNext() {
        return next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }
}
