package cz.itstep.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MultiNode<T> {

    T value;

    final List<MultiNode<T>> siblings = new ArrayList<>();

    public MultiNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", siblings=" + siblings +
                '}';
    }
}
