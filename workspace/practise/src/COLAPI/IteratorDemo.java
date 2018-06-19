package COLAPI;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("Pankaj");
		hs.add("Kumar");
		hs.add("gupta");
		hs.add("GUPTA");
		System.out.println(hs);
		
Iterator<String> i= hs.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
