package cz.itstep.algorithm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MainNode {

    public static void main(String[] args) {
        final MultiNode<Integer> top = createNewMap();

        final List<MultiNode<Integer>> siblings = top.siblings;

        System.out.println(top);


        final SingleNode<Integer> linkedList = createNewLinkedList();
        System.out.println(nodeCount(linkedList));
    }

    private static SingleNode<Integer> createNewLinkedList() {
        final SingleNode<Integer> thirdNode = new SingleNode<>(3, null);
        final SingleNode<Integer> secondNode = new SingleNode<>(2, thirdNode);
        return new SingleNode<>(1, secondNode);
    }

    private static MultiNode<Integer> createNewMap() {
        final MultiNode<Integer> firstMultiNode = new MultiNode<>(1);
        final MultiNode<Integer> secondMultiNode = new MultiNode<>(2);
        final MultiNode<Integer> thirdMultiNode = new MultiNode<>(3);

        firstMultiNode.siblings.add(secondMultiNode);
        firstMultiNode.siblings.add(thirdMultiNode);

        secondMultiNode.siblings.add(thirdMultiNode);

        return firstMultiNode;
    }


    private static int nodeCount(SingleNode<?> head) {
        if (head == null) return 0;

        int count = 0;

        SingleNode<?> actual = head;
        do {
            count++;
            actual = actual.next;
        } while (actual != null);

        return count;
    }
}
