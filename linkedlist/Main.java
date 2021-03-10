package linkedlist;

public class Main {

	public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		
		ll.add(1);
		ll.add(19);
		ll.add(6);
		ll.print();
		System.out.println();
		MyLinkedList<String> ll2=new MyLinkedList<String>();
		
		ll2.add("Orange");
		ll2.add("Red");
		ll2.add("Green");
		

		
		ll2.print();
	
		
	}

}
