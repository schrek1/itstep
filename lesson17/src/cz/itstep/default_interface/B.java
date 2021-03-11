package cz.itstep.default_interface;

public interface B {

    default void compute() {
        System.out.println("B");
    }
}
