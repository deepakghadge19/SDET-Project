package hardComplexityProblem1;

public class LinkedListApp {
    public static void main(String[] args) {
        Linked linked = new Linked();
        Node array[] = new Node[3];

        array[0] = linked.getNewNode(1);
        array[0].next = linked.getNewNode(4);
        array[0].next.next = linked.getNewNode(5);

        array[1] = linked.getNewNode(1);
        array[1].next = linked.getNewNode(3);
        array[1].next.next = linked.getNewNode(4);

        array[2] = linked.getNewNode(2);
        array[2].next = linked.getNewNode(6);

        Node mergedList = linked.mergeKSortedLists(array, array.length - 1);
        System.out.println("Merged Sorted LinkedList is :");
        linked.printList(mergedList);
    }
}
