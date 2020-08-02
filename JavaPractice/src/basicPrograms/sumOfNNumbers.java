package basicPrograms;

import java.util.Scanner;

public class sumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int sumOfNNumbers=0;
		for (int i=0;i<=n;i++) {
			sumOfNNumbers=sumOfNNumbers+i;
			if(n==-1) break;
		}
		System.out.println("Sum of N Numbers are: " +sumOfNNumbers);

	}

}
