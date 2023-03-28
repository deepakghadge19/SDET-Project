package collections_16March2023;

import java.util.HashSet;
import java.util.Set;

public class HashSetFeature {
    public void hashSetOperations() {
        //Set<String> hashset = new HashSet<>();
        Set hashset = new HashSet();
        hashset.add("deepak");
        hashset.add("suyog");
        hashset.add("nitin");
        hashset.add("prasad");
        System.out.println("All added elements from hash set :" + hashset);

        boolean isRemoved = hashset.remove("prasad");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("\nElement 'prasad' is removed from HashSet");
            System.out.println("Hash set after remove the element :" + hashset);
        } else {
            System.out.println("\nElement is not removed from HashSet");
        }
        System.out.println("\nPrint all elements from HashSet :");
        for (Object hashSetElement : hashset) {
            System.out.println(hashSetElement);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSetFeature hashSetFeature = new HashSetFeature();
        hashSetFeature.hashSetOperations();
    }

}
