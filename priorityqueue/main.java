package priorityqueue;

import java.util.PriorityQueue;

public class main {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("Apple");
		
		pq.add("Grapes");
		pq.add("strawberry");
		
		pq.add("kiwi");
		System.out.println(pq);
		System.out.println("Highest priority -> "+pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}

}
