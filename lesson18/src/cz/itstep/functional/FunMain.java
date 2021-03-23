package cz.itstep.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunMain {

    public static void main(String[] args) {
        final Consumer<Object> objectConsumer = (Object value) -> System.out.println("value = " + value);
        Optional.empty().ifPresent(objectConsumer);

        final List<String> firstClass = List.of("Jan", "Tomas");
        final List<String> secondClass = List.of("Karel", "Petr");

        List<List<String>> school = List.of(firstClass, secondClass);

        school.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.joining(", "));


        IntStream.range(1,4)
                .reduce((result, element) -> result + element)
                .ifPresent(i -> System.out.println(i));

        final int sum = IntStream.range(1, 4)
                .reduce(5, (result, element) -> result + element);

        System.out.println(sum);


    }
}
