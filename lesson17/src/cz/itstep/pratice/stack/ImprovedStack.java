package cz.itstep.pratice.stack;

import java.util.LinkedList;
import java.util.Optional;

public class ImprovedStack<T> implements Stack<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    private int count = 0;

    private final int maxCapacity;

    public ImprovedStack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean push(T item) {
        if (item == null || count == maxCapacity) return false;
        linkedList.push(item);
        count++;
        return true;
    }

    @Override
    public Optional<T> pop() {
        if (linkedList.isEmpty()) return Optional.empty();
        count--;
        return Optional.ofNullable(linkedList.pop());
    }

    @Override
    public int count() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return count == maxCapacity;
    }

    @Override
    public void clear() {
        linkedList.clear();
    }

    @Override
    public Optional<T> peek() {
        return Optional.ofNullable(linkedList.peek());
    }
}
