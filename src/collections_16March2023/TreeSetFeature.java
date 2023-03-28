package collections_16March2023;

import java.util.TreeSet;

public class TreeSetFeature {
    public void treeSetOperations() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Z");
        treeSet.add("A");
        treeSet.add("X");
        treeSet.add("Y");
        System.out.println("Elements from treeSet :" + treeSet);// print element in ordered form

        System.out.println("Check if C present :" + treeSet.contains("C"));

        boolean isRemoved = treeSet.remove("A");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("Element 'A' is removed and updated treeSet is :" + treeSet);
        } else {
            System.out.println("Element 'A' is not removed ");
        }
    }

    public static void main(String[] args) {
        TreeSetFeature treeSetFeature = new TreeSetFeature();
        treeSetFeature.treeSetOperations();
    }

}
