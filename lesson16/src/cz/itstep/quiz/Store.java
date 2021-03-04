package cz.itstep.quiz;

public interface Store<T> {

    void add(T item);

    T get(int position);

    T[] getAll();
}
