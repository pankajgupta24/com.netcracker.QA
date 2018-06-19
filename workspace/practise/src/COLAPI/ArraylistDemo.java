package COLAPI;

import java.util.ArrayList;

public class ArraylistDemo {

	
	public static void main (String args[]) {
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("pankaj");
		a.add("kumar");
		a.add("Gupta");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("kumar"));
		System.out.println(a.indexOf("Gupta"));
		
	}
}
