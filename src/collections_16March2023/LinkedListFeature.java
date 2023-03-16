package collections_16March2023;

import java.util.LinkedList;

public class LinkedListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> list = new  LinkedList<>();
			list.add("sun");
			list.add("mon");
			list.add("tues");
			list.add("wed");
			System.out.println("Elements from LinkedList :"+ list);
			list.add(1,"thurs");
			System.out.println("LinkedList after adding element at 1st index :"+ list);
			list.remove(2);
			System.out.println("Elements after remove from LinkedList :"+ list);
			list.addFirst("sat");
			list.addLast("sun");
			System.out.println("Elements from LinkedList :"+ list);
	}

}
