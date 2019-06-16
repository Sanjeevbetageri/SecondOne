package PractiseCollections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class AbstractColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractCollection<String> abs = new TreeSet<String>();
		abs.add("Hi");
		abs.add("Sanjeev");
		abs.add("Wru?");
		
		System.out.println(abs);
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(4);
		t.add(5);
		t.add(3);
		
		AbstractCollection<String> al = new ArrayList<String>();
		
		al.add("San");
		al.add("Betageri");
		
		System.out.println(al);
		
		Iterator I5 = al.iterator();
		while(I5.hasNext()) {
			System.out.println(I5.next());
		}
		
		TreeSet<Character> t1=new TreeSet<Character>();
		t1.add('Z');
		t1.add('C');
		t1.add('E');
		
		System.out.println(t1);
		
		Iterator i = t.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println(t);
		System.out.println(t.first());
		
		
		System.out.println("Add All");
		
		TreeSet<String> t2 = new TreeSet<String>();
		t2.addAll(abs);
		Iterator I2= t2.iterator();
		while(I2.hasNext())
		{
	
		System.out.println(I2.next());
	}}

}
