package cz.itstep.lecture.generic.old;

import java.util.Arrays;
import java.util.Comparator;

public class MainForGeneralStore {

    public static void main(String[] args) {
        NumberStore numberStore = new NumberStore(new int[]{1, 2, 3, 4});
        StringStore stringStore = new StringStore(new String[]{"a", "b", "c"});

        GeneralStore generalNumberStore = new GeneralStore(new Integer[]{1, 4, 3, 2, 0});
        GeneralStore generalStringStore = new GeneralStore(new String[]{"z", "a", "b", "c"});

        System.out.println(Arrays.toString(generalNumberStore.sortItems(Comparator.naturalOrder())));
        System.out.println(Arrays.toString(generalStringStore.sortItems(Comparator.naturalOrder())));

        double sum = sumNumbers(generalNumberStore);
        System.out.println("Sum: " + sum);

        double sumStr = sumNumbers(generalStringStore);
        System.out.println("Sum: " + sumStr);
    }


    public static double sumNumbers(GeneralStore numberStore) {
        double sum = 0;
        for (Object obj : numberStore.getItems()) {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                sum += number.doubleValue();
            }
        }
        return sum;
    }


}
