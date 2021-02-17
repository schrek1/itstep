package cz.itstep.practice1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NumberStore numberStore = new NumberStore(new int[]{1, 2, 3, 4});
        IShow showableInstance = numberStore;

        IShow someShowable = getSomeShowable();
        if (someShowable instanceof NumberStore) {
            NumberStore ns = (NumberStore) someShowable;
            int[] numbers = ns.getNumbers();
            System.out.println("cisla -> " + Arrays.toString(numbers));
        }
        if (someShowable instanceof StringStore) {
            StringStore ss = (StringStore) someShowable;
            String[] numbers = ss.getStrings();
            System.out.println("pismena -> " + Arrays.toString(numbers));
        }

        IShow[] showables = {numberStore, someShowable};
        for (IShow showable : showables) {
            showable.print();
        }
    }


    public static IShow getSomeShowable() {
        return new NumberStore(new int[]{1, 2, 3, 4});
//        return new StringStore(new String[]{"a", "b", "c"});
//        return null;
    }
}
