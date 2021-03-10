package list;
import java.util.*;
public class firstlinkedlist {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList();
		List<Integer> al= new ArrayList();
		
		ll.add(2);
		ll.add(3);
		ll.add(9);
		
		ll.set(2,10);
		System.out.println(ll);
		
//		getTime(ll);
//		getTime(al);
//		
	 }
	
//	static void getTime(List<Integer> list) {
//		long start = System.currentTimeMillis();
//		for(int i=0;i<=100000;i++) {
//			list.add(0,i);
//			
//		}
//		
//		long end=System.currentTimeMillis();
//		System.out.println(list.getClass().getName() + " "+(end-start));
	}


