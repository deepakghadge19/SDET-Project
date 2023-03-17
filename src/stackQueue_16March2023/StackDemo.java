package stackQueue_16March2023;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("AA");
		stack.push("CC");
		stack.push("BB");
		stack.push("DD");

		System.out.println("Original stack :" + stack);
		System.out.println("Top Element :" + stack.peek());
		System.out.println("Popped Element :" + stack.pop());
		System.out.println("Now stack looks like :" + stack);
	}
}
