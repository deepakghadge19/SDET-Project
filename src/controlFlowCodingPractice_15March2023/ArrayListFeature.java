package controlFlowCodingPractice_15March2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFeature {
    public void arrayListOperation() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Deepak");
        arrayList.add("Suyog");
        arrayList.add("Nikhil");
        arrayList.add("Dipesh");

        System.out.println("Size of array list before remove element :" + arrayList.size());
        System.out.println("Array list before remove element :" + arrayList);

        // Remove elements from ArrayList
        boolean isRemoved = arrayList.remove("Suyog");
        System.out.println("\nCheck the element is removed or not(true/false) : " + isRemoved);
        System.out.println("Array list after remove the element :" + arrayList);
        System.out.println("Size of array list after remove elements :" + arrayList.size());

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
Array list before remove element :[Deepak, Suyog, Nikhil, Dipesh]

Check the element is removed or not(true/false) : true
Array list after remove the element :[Deepak, Nikhil, Dipesh]
Size of array list after remove elements :3

Print all elements from ArrayList :
Deepak Nikhil Dipesh 
 */
