package cz.itstep.default_interface;

public class IntImpl implements A, B {

    @Override
    public void compute() {
        A.super.compute();
    }

    public static void main(String[] args) {
        new IntImpl().compute();
    }
}
