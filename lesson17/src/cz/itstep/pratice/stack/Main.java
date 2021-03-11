package cz.itstep.pratice.stack;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println("old stack:");

        final Stack<Integer> stack = new StackImpl<>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.peek().ifPresent(System.out::println);

        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));

        final Optional<Integer> optValue = stack.peek();
        if (optValue.isPresent()) {
            final int value = optValue.get();
        }


        System.out.println("new stack by Java Collections:");

        Stack<Integer> improvedStack = new ImprovedStack<>(3);


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        stack.peek().ifPresent(System.out::println);

        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
        stack.pop().ifPresent(value -> System.out.println(value));
    }

}
