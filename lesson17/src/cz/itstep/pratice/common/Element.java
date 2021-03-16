package cz.itstep.pratice.common;

import java.util.Optional;

public class Element<T> {
    private T value;

    private Element<T> next;

    private Element<T> before;

    public Element(T value) {
        this.value = value;
    }

    public Element(T value, Element<T> next) {
        this.value = value;
        this.next = next;
    }

    public Element(T value, Element<T> next, Element<T> before) {
        this.value = value;
        this.next = next;
        this.before = before;
    }

    public Optional<T> getValue() {
        return Optional.ofNullable(value);
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element<T> getBefore() {
        return before;
    }

    public void setBefore(Element<T> before) {
        this.before = before;
    }
}
