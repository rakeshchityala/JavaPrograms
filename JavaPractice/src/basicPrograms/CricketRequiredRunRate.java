package basicPrograms;

import java.util.Scanner;

public class CricketRequiredRunRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalOvers=50;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of overs bowled so far");
		int numberOfOversBowledSoFar=sc.nextInt();
		System.out.println("Enter Current run Rate");
		float currentRunRate = sc.nextFloat();
		System.out.println("Enter target to score");
		int targetToScore=sc.nextInt();		
		double requiredRunRate =(targetToScore-(currentRunRate*numberOfOversBowledSoFar))/(totalOvers-numberOfOversBowledSoFar);
		System.out.printf("Required RunRate is: "  +String.format("%.2f", requiredRunRate));	

	}

}
