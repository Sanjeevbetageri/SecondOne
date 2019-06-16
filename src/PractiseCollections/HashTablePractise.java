package PractiseCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTablePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Character> ht = new Hashtable<>();
		ht.put(0, 'A');
		ht.put(1, 'B');
		ht.put(5, 'F');
		ht.put(6, 'G');
		System.out.println(ht);
		ht.put(2, 'C');
		ht.put(5, 'f');
		
		System.out.println(ht);
		
		//Set s = ht.entrySet();
		
		Iterator i = ht.entrySet().iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Entry) i.next();
			System.out.println("Key is "+ m.getKey() + " and value is "+m.getValue());
		}
		
		

	}

}
