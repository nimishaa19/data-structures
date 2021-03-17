package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,String> hm= new HashMap();
		
		hm.put(1, "one");
		hm.put(2,"two");
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		

	}

}
