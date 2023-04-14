package HardComplexityProblem1;

public class Linked {
    //It merges the k sorted linked lists
    public Node mergeKSortedLists(Node[] array, int lastListIndex) {
        while (lastListIndex != 0) {
            int firstIndex = 0;
            int secondIndex = lastListIndex;
            while (firstIndex < secondIndex) {
                array[firstIndex] = mergeTwoList(array[firstIndex], array[secondIndex]);
                firstIndex++;
                secondIndex--;
                if (firstIndex >= secondIndex) {
                    lastListIndex = secondIndex;
                    break;
                }
            }
        }
        return array[0];
    }

    //To merge two linked list
    public Node mergeTwoList(Node firstNode, Node secondNode) {
        if (firstNode == null && secondNode == null) {
            return null;
        }
        Node temp = new Node();
        Node finalList = temp;
        while (firstNode != null && secondNode != null) {
            if (firstNode.data < secondNode.data) {
                temp.next = firstNode;
                firstNode = firstNode.next;
            } else {
                temp.next = secondNode;
                secondNode = secondNode.next;
            }
            temp = temp.next;
        }
        temp.next = (firstNode != null) ? firstNode : secondNode;
        return finalList.next;
    }

    //To generate a new node
    public Node getNewNode(int key) {
        Node node = new Node();
        node.next = null;
        node.data = key;
        return node;
    }

    //To print the complete linked list
    public void printList(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printList(node.next);
    }
}
