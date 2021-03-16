package cz.itstep.pratice.queue;


import java.util.LinkedList;
import java.util.Optional;
import java.util.SortedSet;

public class ImprovedQueueImpl<T> implements Queue<T> {

    private final int maxCapacity;

    private final java.util.Queue<T> queue = new LinkedList<>();

    public ImprovedQueueImpl(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean isFull() {
        return !queue.isEmpty();
    }

    @Override
    public boolean push(T item) {
        if (queue.size() == maxCapacity) return false;
        return queue.add(item);
    }

    @Override
    public Optional<T> pool() {
        return Optional.ofNullable(queue.poll());
    }

    @Override
    public Optional<T> peek() {
        return Optional.ofNullable(queue.peek());
    }
}
