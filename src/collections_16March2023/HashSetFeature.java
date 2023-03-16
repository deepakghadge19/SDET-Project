package collections_16March2023;

import java.util.HashSet;
import java.util.Set;

public class HashSetFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		System.out.println("All added elements from hash set :"+ hashset);
		hashset.remove("C");
		System.out.println("hash set after remove C :"+ hashset);
		for(String str : hashset)
		{
			System.out.println(str);
		}
		
	}

}
