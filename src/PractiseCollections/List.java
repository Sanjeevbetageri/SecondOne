package PractiseCollections;

import java.util.ArrayList;
import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hi");
		l1.add("dude");
		System.out.println("Index of dude " + l1.indexOf("dude"));
		l1.add(1, "Yo");
		System.out.println(l1.indexOf("Yo"));
		System.out.println(l1);
		
		System.out.println(l1.get(1));
		System.out.println(l1.get(2));
		
		Iterator I = l1.iterator();
		while(I.hasNext())
		{
			System.out.print("  " + I.next());
		}
		
		
		
	}

}
