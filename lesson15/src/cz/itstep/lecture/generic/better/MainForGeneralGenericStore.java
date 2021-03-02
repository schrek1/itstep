package cz.itstep.lecture.generic.better;

import cz.itstep.lecture.generic.old.NumberStore;
import cz.itstep.lecture.generic.old.StringStore;

import java.util.Arrays;
import java.util.Comparator;

public class MainForGeneralGenericStore {

    public static <Y> void main(String[] args) {
        NumberStore numberStore = new NumberStore(new int[]{1, 2, 3, 4});
        StringStore stringStore = new StringStore(new String[]{"a", "b", "c"});

        GeneralGenericStore<Integer> genericNumberStore = new GeneralGenericStore<>(new Integer[]{1, 4, 3, 2, 0});
        GeneralGenericStore<String> genericStringStore = new GeneralGenericStore<>(new String[]{"z", "a", "b", "c"});

        Comparator<String> tComparator = Comparator.naturalOrder();

        System.out.println(Arrays.toString(genericNumberStore.sortItems(Comparator.naturalOrder())));
        System.out.println(Arrays.toString(genericStringStore.sortItems(Comparator.naturalOrder())));

        double sum = sumNumbers(genericNumberStore);
        System.out.println("Sum: " + sum);

        // compile problem
//        double sumStr = sumNumbers(genericStringStore);
//        System.out.println("Sum: " + sumStr);

    }


    public static double sumNumbers(GeneralGenericStore<? extends Number> numberStore) {
        double sum = 0;
        for (Number number : numberStore.getItems()) {
            sum += number.doubleValue();
        }
        return sum;
    }


}
