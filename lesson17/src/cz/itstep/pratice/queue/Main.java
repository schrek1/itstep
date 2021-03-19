package cz.itstep.pratice.queue;


import java.util.Map;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new QueueImpl<>(3);
//        testQueue(queue);

        Queue<Integer> improvedQueue = new ImprovedQueueImpl<>(3);
        testQueue(improvedQueue);

    }

    private static void testQueue(Queue<Integer> queue) {
        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        System.out.println(queue.push(4));
        System.out.println(queue.push(5));

        System.out.println(queue.isFull());

        for (int i = 0; i < 5; i++) {
            if (!queue.isEmpty()) {
                System.out.print("odebrano:");
                queue.pool().ifPresent(System.out::println);
                System.out.print("nsledujici:");
                queue.peek().ifPresent(System.out::println);
            }
        }
    }
}
