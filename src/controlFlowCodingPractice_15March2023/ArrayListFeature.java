package controlFlowCodingPractice_15March2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			arrayList.add(i);
		}
		System.out.println("Array List :" + arrayList);
		// Remove elements from ArrayList
		arrayList.remove(3);
		System.out.println("Array List after remove element :" + arrayList);

		// Print all elements from ArrayLis
		for (int num : arrayList) {
			System.out.print(num + " ");
		}

	}

}
