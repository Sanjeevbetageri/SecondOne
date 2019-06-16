package PractiseCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> L1= new LinkedList<String>();
		L1.add("A");
		L1.add("B");
		L1.add(2,"D");
		System.out.println(L1.indexOf("D"));
		L1.addFirst("First");
		System.out.println(L1.indexOf("D"));
		L1.addLast("Last");
		
		System.out.println(L1);
		
		Object element = L1.get(2);
		System.out.println(element);
		L1.set(4, "Set Val");
		System.out.println(L1);
		
		Iterator I = L1.iterator();
		while(I.hasNext())
		{
			System.out.print(I.next());
		}
	}

}
