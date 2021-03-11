package cz.itstep.pratice.stack;

import cz.itstep.pratice.common.Item;

import java.util.Optional;

public interface Stack<T> {

    /**
     * put item into the stack
     *
     * @param item item
     * @return true if pushed, false if not
     */
    boolean push(T item);

    /**
     * get and remove item from the stack
     *
     * @return item or empty
     */
    Optional<T> pop();

    /**
     * count of items in the stack
     *
     * @return count of items, 0 when empty
     */
    int count();

    boolean isEmpty();

    boolean isFull();

    /**
     * remove all items in the stack
     */
    void clear();

    /**
     * return item on the top (without removing)
     *
     * @return item or empty
     */
    Optional<T> peek();

}
