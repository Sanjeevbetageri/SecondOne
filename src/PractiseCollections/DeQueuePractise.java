package PractiseCollections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueuePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> d = new LinkedList<String>();
		d.add("Ab");
		d.add("Bc");
		d.add("Cd");
		d.add("De");
		d.add("Ef");
		d.add("Fg");
		d.add("Gh");
		
		System.out.println(d);
		
		d.addLast("Hi");
		System.out.println(d);
		
		d.addFirst("A");
		System.out.println(d);
		
		d.removeLast();
		System.out.println(d);
		
		System.out.println(d.peekLast());
		System.out.println(d);
		
		Iterator I = d.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		
	
	}

}
