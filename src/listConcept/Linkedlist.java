package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("San");
		ll.add("Dave");
		ll.add("Vee");
		ll.add("Four");
		System.out.println(ll);
		
		ll.addFirst("First");
		ll.addLast("Last");
		System.out.println(ll);
		
		
		System.out.println(ll.get(0));
		
		ll.set(0,"SetVal");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
	
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	//adv for loop
	System.out.println("Adv For Loop");
	for(String str : ll)
	{
		System.out.println(str);
	}
	
	//Iterator
	Iterator<String> it2 = ll.iterator();
	while(it2.hasNext()){
		System.out.println(it2.next());
	}
	
	
	// ******Using While Loop
	int num=0;
	System.out.println("While loop");
	while(ll.size()>num)
	{
		System.out.println(ll.get(num));
		num++;
	}
	
	
	
	
	}

}
