package listConcept;

import java.util.Enumeration;
import java.util.Hashtable;
//import java.util.Map.Entry;
import java.util.Set;

public class HTConcept {

	public static void main(String[] args) {
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Sanjeev");
		h1.put(2, "Dav");
		h1.put(3, "Eera");
		
		//create a clone copy
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		
		System.out.println("h1" + h1);
		System.out.println("h2" +h2);
		
		h1.clear();
		
		System.out.println("h1" + h1);
		System.out.println("h2" +h2);
	
		Hashtable st = new Hashtable();
		st.put("A", "Sanjeev");
		st.put("B", "Student");
		st.put("C", 23);
		
		if(st.contains("Sanjeev")) {
			System.out.println("present");
		}

		//print all the values using enumeration
		st.elements();
		Enumeration e = st.elements();
		System.out.println("print all ");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//get all using entry
		Set s = st.entrySet();
		System.out.println(s);
	
		Hashtable st1 = new Hashtable();
		st1.put("A", "Sanjeev");
		st1.put("B", "Student");
		st1.put("C", 23);
		
		//check if both are equal
		if(st.equals(st1));
		{
			System.out.println("equal");
		}
		
		System.out.println(st1.get("B"));
	
		System.out.println("Hashcode value of st" +st.hashCode());
		System.out.println("Hashcode value of st1" +st1.hashCode());
	}

}
