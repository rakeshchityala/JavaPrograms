package caveOfProgrammming;

import java.util.ArrayList;

public class GenericsWithWildChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfNumbers = new ArrayList<String>();
		listOfNumbers.add("One");
		listOfNumbers.add("Two");
		showList(listOfNumbers);
	}
	public static void showList(ArrayList<String> listOfNumbers) {
		for (String value: listOfNumbers) {
			System.out.println(value);
		}
		
	}

}
