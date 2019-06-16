package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ListsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("Sanjeev");
		ar1.add(0, "element");
		System.out.println(ar1.get(0));
		
		//Employee class objects
		Employee e1=new Employee("San", 27 ,"Testing");
		Employee e2=new Employee("Dav",28,"IT");
		Employee e3=new Employee("Veer",29,"Shenta");
		
		ArrayList<Employee> ar2=new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//iterator to traverse through the values
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.Dept);
		}
		
		
		ArrayList <String> ar5 = new ArrayList<String>();
		ar5.add("Sanjeev");
		ar5.add("element");
		ar5.add("Three");
		
		ArrayList <String> ar6 = new ArrayList<String>();
		ar6.add("One");
		ar6.add("Two");
		ar6.add("Four");
		
		
		ar5.addAll(ar6);
		for(int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		
	}

}
