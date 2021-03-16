package cz.itstep.pratice.queue;

import cz.itstep.pratice.common.Element;

import java.util.Optional;

public class QueueImpl<T> implements Queue<T> {

    private final int maxCapacity;

    private Element<T> tail;
    private Element<T> head;

    private int count = 0;

    public QueueImpl(int maxCapacity) {
        this.maxCapacity = maxCapacity;
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
    public boolean push(T item) {
        if (isFull()) return false;

        final Element<T> element = new Element<>(item, tail);
        if (tail != null) tail.setBefore(element);
        tail = element;
        if (head == null) head = element;

        count++;

        return true;
    }

    @Override
    public Optional<T> pool() {
        if (isEmpty()) return Optional.empty();

        final Element<T> firstElement = head;
        if (tail == head) tail = null;
        head = firstElement.getBefore();

        count--;

        return firstElement.getValue();
    }

    @Override
    public Optional<T> peek() {
        return head != null ? head.getValue() : Optional.empty();
    }
}
