package controlFlowCodingPractice_15March2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFeature {
    public void arrayListOperation() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("deepak");
        arrayList.add("suyog");
        arrayList.add("nikhil");
        arrayList.add("dipesh");
        System.out.println("Size of array list before remove element :" + arrayList.size());
        System.out.println("Array list before remove element :" + arrayList);

        // Remove elements from ArrayList
        boolean isRemoved = arrayList.remove("suyog");
        //To check the element is removed or not
        if (isRemoved == true) {
            System.out.println("\nElement 'suyog' is removed from ArrayList");
            System.out.println("Array list after remove the element :" + arrayList);
            System.out.println("Size of array list after remove elements :" + arrayList.size());
        } else {
            System.out.println("\nElement is not removed from ArrayList");
        }
        // Print all elements from ArrayList
        System.out.println("\nPrint all elements from ArrayList :");
        for (String name : arrayList) {
            System.out.print(name + " ");
        }
    }

    public static void main(String[] args) {
        ArrayListFeature arrayListFeature = new ArrayListFeature();
        arrayListFeature.arrayListOperation();
    }
}
/*===============OUTPUT============
Size of array list before remove element :4
Array list before remove element :[deepak, suyog, nikhil, dipesh]

Element 'suyog' is removed from ArrayList
Array list after remove the element :[deepak, nikhil, dipesh]
Size of array list after remove elements :3

Print all elements from ArrayList :
deepak nikhil dipesh
 */
