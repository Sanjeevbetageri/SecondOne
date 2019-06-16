package PractiseCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet<String> ();
		s.add("What");
		s.add("Is");
		s.add("What");
		s.add("Your");
		s.add("Name");
		s.add("Name");
		
		Set <String> s2 = new HashSet<String> ();
		s2.add("What");
		s2.add("are");
		s2.add("Your");
		s2.add("Probs");
		
		//s.addAll(s2);
		
		System.out.println(s);
		
		
		Set<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(5);
		ts1.add(9);
		ts1.add(4);
		System.out.println(ts1);
		Set<String> ts = new TreeSet<String>(s);
		System.out.println(ts);
		
		ArrayList <String> l = new ArrayList<String> (s);
		Collections.sort(l);
		//System.out.println(l);
	}

}
