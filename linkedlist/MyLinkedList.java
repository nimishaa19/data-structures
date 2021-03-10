package linkedlist;
//generic class
public class MyLinkedList<E> {
	
	Node head;
	//add function
	public void add(E data) {
		 Node toadd= new Node(data);
		 
		 if(isEmpty()) {
			 head=toadd;
			 return;
			 }
		 
		 
		 
		 Node temp=head;
		 while (temp.next!=null) {
			 temp= temp.next;
		 }
		 temp.next= toadd;	  
	 }
	
	// remove last function
	
	public E removelast() throws Exception {
		Node temp=head;
		if(temp==null) {
			throw new Exception("Cant remove from empty linked list");
		}
		
		if(temp.next==null) {
			Node toRemove=head;
			head=null;
			return (E) toRemove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node toRemove= temp.next;
		temp.next=null;
		return (E) toRemove.data;
	}
	
	// get last function
	public E getlast() throws Exception {
		Node temp=head;
		if(temp==null) {
			throw new Exception("Cannot get last element from empty linked list");
		}
		
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		
		return (E) temp.data;
	}
	
	 
	 // print function
	 void print() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data +" ");
			 temp= temp.next;
			 
		 }
	 }
	 // get function
	 void get(int n) {
		 Node temp=head;
		while(temp!=null) {
			if(n==temp.index) {
				System.out.println(temp.data);
			}
			temp=temp.next;}}
	 
	 // index 
	 int indexOf(E stuff) {
		 int count=0;
		 Node temp=head;
		 while(temp!=null) {
			 if(temp.data==stuff) {
				 temp.index=count;
				 return temp.index;
				 
			 }
			 count+=1;
			 temp=temp.next;}
			 
		 
		return -1;
	 }
	 
	// length function
	 
	int length() {
		int count =0;
		Node temp=head;
		while(temp!=null) {
			
			count+=1;
			temp=temp.next;
		}
		return count;
	}
	 
	 // isEmpty function
	public boolean isEmpty() {
		 return head==null?true:false;
	 }
    // defining node
	public static class Node<E>{
		E data;
		public Node next;
		int index;
		
		public Node(E data) {
			this.data=data;
			next=null;
			
		}
	}

}
