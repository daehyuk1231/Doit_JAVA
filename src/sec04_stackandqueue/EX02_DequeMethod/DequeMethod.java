package sec04_stackandqueue.EX02_DequeMethod;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeMethod {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.addFirst("밤");
		deque.addLast("별");
		deque.addFirst("달");

		System.out.println(deque); // [달, 밤, 별]
		deque.removeLast(); // "별" 제거
		System.out.println(deque); // [달, 밤]

		Deque<String> dequeSynch = new ConcurrentLinkedDeque<>();

		dequeSynch.add("사과");
		dequeSynch.addFirst("바나나");
		dequeSynch.addLast("딸기");

		System.out.println(dequeSynch);
		while (!dequeSynch.isEmpty()) {
			System.out.println(dequeSynch.pollFirst()); // FIFO 순으로 출력
		}
	}
}