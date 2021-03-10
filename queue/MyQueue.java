package queue;


public class MyQueue<E>{
	Node<E> head,rear;
	E data;
	
	public static class Node<E>{
		E data;
		Node next;
		
		Node(E data){
			this.data=data;
			next=null;
		}	
		
	}
	
	
	void enqueue(E e) {
		Node<E> toadd= new Node<>(e);
		
		if(head==null) {
			head=rear=toadd;
		}
		rear.next=toadd;
		rear=toadd;
			
	}
	
	
	E remove() {
	  if(head==null) {
		  return null;
	  }
	  Node temp=head;
	  head=head.next;
	  return (E)temp.data;
		
	}
	
	E element() {
		return head.data;
	}
	

}
