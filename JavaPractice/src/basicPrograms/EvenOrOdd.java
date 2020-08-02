package basicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		if (n%2==0 && n>0) {
			System.out.println("Given Number is Even");
		}if (n<0) {
			System.out.println("Given number is negative");
		}else {
			System.out.println("Given number is odd");
		}

	}

}
