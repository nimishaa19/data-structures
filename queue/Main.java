package queue;

public class Main {

	public static void main(String[] args) {
		MyQueue<Integer> q=new MyQueue<>();
		q.enqueue(19);
		q.enqueue(20);
		q.enqueue(21);
		q.enqueue(22);
		System.out.println(q.remove());
		System.out.println(q.element());

	}

}
