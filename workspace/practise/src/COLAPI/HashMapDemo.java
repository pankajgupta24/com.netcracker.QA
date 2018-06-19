package COLAPI;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer, String> ();
		hm.put(0, "Pankaj");
		hm.put(1, "Kumar");
		hm.put(2, "Gupta");
		hm.put(1, "Pune");
		
		System.out.println(hm.get(2));
		hm.remove(1);
		System.out.println(hm.get(1));
	}

	
}
