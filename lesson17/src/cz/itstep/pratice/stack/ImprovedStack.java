package cz.itstep.pratice.stack;

import java.util.LinkedList;
import java.util.Optional;

public class ImprovedStack<T> implements Stack<T> {

    private final LinkedList<T> linkedList = new LinkedList<>();

    private final int maxCapacity;

    public ImprovedStack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean push(T item) {
        if (item == null || linkedList.size() == maxCapacity) return false;
        linkedList.push(item);
        return true;
    }

    @Override
    public Optional<T> pop() {
        if (linkedList.isEmpty()) return Optional.empty();
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
        return linkedList.size() == maxCapacity;
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
