package cz.itstep.algorithm;

public class SingleNode<T> {

    T value;

    SingleNode<T> next;

    public SingleNode(T value, SingleNode<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
