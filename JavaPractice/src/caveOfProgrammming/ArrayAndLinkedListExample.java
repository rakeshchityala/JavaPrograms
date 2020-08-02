package caveOfProgrammming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList=new ArrayList<Integer>();
		List<Integer> linkedList=new LinkedList<Integer>();	
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}
	public static void doTimings (String type, List<Integer> list) {
		for (int i=0;i<1E5;i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		/*
		//add items at the end of list
		for (int i=0;i<1E5;i++) {
			list.add(i);
		}
		*/
		
		//add item else where in the list
		for (int i=0;i<1E5;i++) {
			list.add(0, i);
		}
		long end= System.currentTimeMillis();
		
		System.out.println("Time taken: " +(end-start)+ " ms for " +type);
	}

}
