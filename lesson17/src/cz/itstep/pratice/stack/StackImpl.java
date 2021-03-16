package cz.itstep.pratice.stack;

import cz.itstep.pratice.common.Element;

import java.util.Optional;

public class StackImpl<T> implements Stack<T> {

    private Element<T> head;
    private int count = 0;
    private final int maxCapacity;

    public StackImpl(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean push(T item) {
        if (item == null || count == maxCapacity) return false;
        head = new Element<>(item, head);
        count++;
        return true;
    }

    @Override
    public Optional<T> pop() {
        if (head == null) return Optional.empty();

        Element<T> forPop = head;
        head = forPop.getNext();

        count--;

        return forPop.getValue();
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == maxCapacity;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Optional<T> peek() {
        return head != null ? head.getValue() : Optional.empty();
    }

}
