package caveOfProgrammming;

import java.util.ArrayList;

public class GenericsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Banana");
		list.add("apple");
		String fruit= (String) list.get(1);
		System.out.println(fruit);
		
		ArrayList<String> string=new ArrayList<String>();
		string.add("cat");
		string.add("dog");
		String animal = string.get(1);
		System.out.println(animal);
		

	}

}
