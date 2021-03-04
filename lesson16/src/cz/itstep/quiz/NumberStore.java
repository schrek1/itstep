package cz.itstep.quiz;

import java.util.List;

/**
 * Description...
 *
 * @param <T> type of Number
 */
public class NumberStore<T extends Number> implements Store<T> {

    /**
     * for storing numbers
     */
    public T[] numbers;

    static <T extends List<T>> void getList() {

    }


    /**
     *
     * adding number to store
     *
     * @param item some number {@link Number}
     */
    @Override
    public void add(T item) {

    }

    /**
     *
     * @param position
     * @return
     * @throws RuntimeException when position not exists
     */
    @Override
    public T get(int position) throws RuntimeException{
        return null;
    }

    @Override
    public T[] getAll() {
        return null;
    }

}
