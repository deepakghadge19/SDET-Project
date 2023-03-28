package collections_16March2023;

import java.util.LinkedList;

public class LinkedListFeature {
    public void hashSetOperations() {
        LinkedList<String> list = new LinkedList<>();
        list.add("sun");
        list.add("mon");
        list.add("tues");
        list.add("wed");
        System.out.println("Elements from LinkedList :" + list);
        list.add(1, "thurs");
        System.out.println("LinkedList after adding element at 1st index :" + list);

        boolean isRemoved = list.remove("mon");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("Element 'mon' is removed and updated LinkedList is :" + list);
        } else {
            System.out.println("Element is not removed");
        }

        list.addFirst("sat");
        list.addLast("sun");
        System.out.println("Elements from LinkedList after adding 'sat' and 'sun':" + list);
    }

    public static void main(String[] args) {
        LinkedListFeature linkedListFeature = new LinkedListFeature();
        linkedListFeature.hashSetOperations();
    }
}
