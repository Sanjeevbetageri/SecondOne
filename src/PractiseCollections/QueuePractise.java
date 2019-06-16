package PractiseCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q= new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
		{
			Q.add(i);
		}
		
		System.out.println(Q);
		
		System.out.println(Q.contains(5));
		Q.remove(1);
		System.out.println(Q.size());
		System.out.println(Q.peek());
		System.out.println(Q.poll());
		System.out.println(Q.size());
		//Q.add(4);
		System.out.println(Q);
		
		System.out.println(Q.peek());
	}

}
