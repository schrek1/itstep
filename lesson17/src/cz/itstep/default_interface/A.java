package cz.itstep.default_interface;

public interface A {

    default void compute() {
        System.out.println("A");
    }
}
