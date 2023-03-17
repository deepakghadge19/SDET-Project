package stackQueue_16March2023;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("India");
		q.add("Germany");
		q.add("America");
		System.out.println("Original queue :" + q);
		System.out.println("Head of queue :" + q.peek());
		q.remove();
		System.out.println("Queue after removing the element :" + q);
		System.out.println("Removed Head :"+ q.poll());
		System.out.println("Queue now look like :"+q);
	}
}
