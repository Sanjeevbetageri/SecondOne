package listConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HMConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3,"TC");
		hm.put(5, "value");
		
		System.out.println(hm.get(2));
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
		
		System.out.println(hm.entrySet());
		
		hm.remove(3);
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
		System.out.println(hm);
		
		HashMap<Integer, EmpforHM> emp=new HashMap<Integer, EmpforHM>();
		EmpforHM e1=new EmpforHM("tom",25,"admin");
		EmpforHM e2=new EmpforHM("to",26,"admi");
		EmpforHM e3=new EmpforHM("t",27,"adm");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3,e3);
		
		//traverse the hashMap
		for(Entry<Integer, EmpforHM> m:emp.entrySet()) {
			int key=m.getKey();
			EmpforHM e=m.getValue();
			System.out.println(key + " Info");
			System.out.println(e.name + "  " + e.age + "  "+e.dept);
			
		}
		
	}

}
