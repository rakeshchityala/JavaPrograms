package basicPrograms;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Rakesh");
		//al.add(arg0, arg1);
		System.out.println(al);
		al.remove("Rakesh");
		System.out.println(al);

	}

}
