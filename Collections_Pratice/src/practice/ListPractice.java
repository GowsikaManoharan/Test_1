package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al.add("java");
		al.add(2.98);
		al.add("java1");
		al.add(2);
		al.add("java2");
		al.add(2);
		al.add(6,"String");
		al.add("Check");
		System.out.println(al);
		al.remove(2);
		al1.add(2);
		System.out.println(al);
		al.remove(al);
		System.out.println(al);
		al.addAll(2,al1);
		System.out.println(al);
		al1.add(1);
		al1.add(11);
		al1.add(21);
		al1.add(13);
		al1.add(15);
		al1.add(12);
		al1.add(15);
		al1.add(17);
		al1.add(15);
		al1.add(14);
		al1.add(14);
		Collections.sort(al1,Collections.reverseOrder());
		for(int o :al1)
		{
			System.out.println(o);
		}
		PriorityQueue  al2 = new PriorityQueue();
		al2.add(1);
		al2.add(11);
		al2.add(21);
		al2.add(13);
		al2.add(15);
		LinkedList  al8 = new LinkedList();
		
	}

}
