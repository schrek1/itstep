package cz.itstep.lecture.generic2;

public class GenericsType<TYPE> {

    private TYPE t;

    public TYPE get() {
        return this.t;
    }

    public void set(TYPE t1) {
        this.t = t1;
    }

}
