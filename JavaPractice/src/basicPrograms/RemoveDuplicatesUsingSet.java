package basicPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
	public void RemoveDuplicatesOfStrings() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("Rakesh");
		stringList.add("Reddy");
		stringList.add("Rakesh");
		stringList.add("Reddy");
		System.out.println(stringList.toString());
		Set<String> stringSet=new LinkedHashSet<String>(stringList);
		System.out.println(stringSet);
	}
	
	public void RemoveDuplicatesOfInteger() {
		List<Integer> stringList = new ArrayList<Integer>();
		stringList.add(1);
		stringList.add(2);
		stringList.add(3);
		stringList.add(1);
		stringList.add(2);
		stringList.add(3);
		System.out.println(stringList.toString());
		Set<Integer> stringSet=new LinkedHashSet<Integer>(stringList);
		System.out.println(stringSet);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesUsingSet rdus = new RemoveDuplicatesUsingSet();
		rdus.RemoveDuplicatesOfStrings();
		rdus.RemoveDuplicatesOfInteger();
	}

}
