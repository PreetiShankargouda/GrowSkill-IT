package arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queuedequeue {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("A");
		queue.add("B");
		queue.peek();
		queue.poll();
		queue.add("c");
		
		System.out.println("Peek element " + queue.peek());
		System.out.println("Poll element " + queue.poll());
		
		
		Deque<String> deque = new LinkedList<>();
		deque.add("Preeti");
		deque.addFirst("Pinky");
		deque.addLast("Pintya");
		deque.add("Vijay");
		
		System.out.println("First element: " + deque.getFirst());
		System.out.println("Last element: " + deque.getLast());
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println("Final Queue: " + queue);
		System.out.println("Final Deque: " +deque);
		
		
	}

}
