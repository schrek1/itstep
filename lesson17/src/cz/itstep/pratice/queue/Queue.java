package cz.itstep.pratice.queue;

import java.util.Optional;

public interface Queue<T> {

    boolean isEmpty();

    boolean isFull();

    /**
     * push item to end of queue
     *
     * @param item item
     * @return true when pushed, false when rejected
     */
    boolean push(T item);

    /**
     * get and remove first
     *
     * @return first item or empty
     */
    Optional<T> pool();

    /**
     * get first item
     *
     * @return first item or empty
     */
    Optional<T> peek();
}
