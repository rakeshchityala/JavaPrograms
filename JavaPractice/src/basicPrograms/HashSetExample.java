package basicPrograms;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("US");
		hs.add("india");
		hs.add("India");
		hs.add("INDIA");
		System.out.println(hs);
		

	}

}
