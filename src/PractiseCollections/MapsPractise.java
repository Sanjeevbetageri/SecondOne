package PractiseCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer,String> ();
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		
		System.out.println(m);
		
		m.put(null, "nu");
		System.out.println(m.get(null));
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('A', 1);
		hm.put('B',2);
		hm.put('E',5);
		hm.put('D', 4);
		hm.put('C', 3);
		
		System.out.println(hm);
		
		hm.remove('E');
		System.out.println(hm);
		
		Set s=hm.entrySet();
		Iterator hmi = s.iterator();
		//Iterator hmi=hm.entrySet().iterator();
		while(hmi.hasNext())
		{
			Map.Entry mapEle = (Entry) hmi.next();
			System.out.println("Key is "+mapEle.getKey() );
			System.out.println("Vlaue is "+mapEle.getValue());
		}
		
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(1, "value");
		sm.put(3, "value3");
		sm.put(5, "value5");
		sm.put(2, "value2");
		sm.put(4, "value4");
		
		System.out.println(sm);
		
		System.out.println("first Value of sm is "+sm.get(sm.firstKey()));
		
		Collection C = sm.values();
		System.out.println("Printing coll "+C);
		
		
		
		Set s2=sm.entrySet();
		Iterator tm = s2.iterator();
		
		while(tm.hasNext())
		{
			Map.Entry m1 = (Entry) tm.next();
			System.out.println("Key is "+ m1.getKey());
			System.out.println("Value is "+m1.getValue());
		}
	}

}
