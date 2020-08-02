package basicPrograms;

import java.util.Scanner;

public class BigElementFromAGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIZE");
		int arraySize=sc.nextInt();
		int listOfNumbers[]=new int [arraySize];
		for (int i=0;i<arraySize;i++) {
			listOfNumbers[i]=sc.nextInt();
		}
		int bigNumber=0;
		for(int i=0;i<arraySize;i++) {
			if (bigNumber<listOfNumbers[i]) {
				bigNumber=listOfNumbers[i];
			}			
		}
		System.out.println(bigNumber);

	}

}
