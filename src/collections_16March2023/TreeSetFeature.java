package collections_16March2023;

import java.util.TreeSet;

public class TreeSetFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Z");
		treeSet.add("A");
		treeSet.add("X");
		treeSet.add("Y");
		System.out.println(treeSet);// print element in ordered form
		
		System.out.println("Check if C present :"+ treeSet.contains("C"));
		
		treeSet.remove("A");
		System.out.println(treeSet);

	}

}
