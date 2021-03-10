package deque;

public class MyDeque<E>{
	Node<E> head,tail;
	
	//adding at front function
	public void addtohead(E data) {
		Node<E> toadd=new Node<>(data);
		if(head==null) {
			head=tail=toadd;
		}
		
		head.next=toadd;
		toadd.prev=head;
		head=toadd;
		
	}
	
	//adding at back function
	public void addtotail(E data) {
		
	}
	
	//remove from back function
	
     public E removelast() {
    	 if(head==null) {
    		 return null;
    	 }
    	 Node<E> toremove=tail;
    	 tail=tail.next;
    	 tail.prev=null;
    	 if(tail==null) {
    		 head=null;
    	 }
    	 
    	 return toremove.data;
     }
	
	public static class Node<E>{
		E data;
		Node<E> next,prev;
		
		public Node(E data) {
			this.data=data;
			next=prev=null;
		}
	}
	

}
