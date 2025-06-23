package sec04_stackandqueue.Ex01_StackMethod;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);

		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();

		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9));
		System.out.println();

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();

		System.out.println(stack.empty());
	}
}
