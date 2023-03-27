package controlFlowCodingPractice_15March2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFeature {
    public void arrayListOperation() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("Size of array list before remove elements :" + arrayList.size());
        System.out.println("Array list before remove elements :" + arrayList);

        // Remove elements from ArrayList
        System.out.println("\nElement removed from arrayList is :" + arrayList.remove(1));

        System.out.println("\nSize of array list after remove elements :" + arrayList.size());
        System.out.println("Array list after remove element :" + arrayList);

        // Print all elements from ArrayList
        System.out.println("\nPrint all elements from ArrayList :");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        ArrayListFeature arrayListFeature = new ArrayListFeature();
        arrayListFeature.arrayListOperation();
    }
}
/*===============OUTPUT============
Size of array list before remove elements :4
Array list before remove elements :[10, 20, 30, 40]

Element removed from arrayList is :20

Size of array list after remove elements :3
Array list after remove element :[10, 30, 40]

Print all elements from ArrayList :
10 30 40
 */
