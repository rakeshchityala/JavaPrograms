package JigSawLearning;

import java.util.Scanner;

public class AddingThreeSequelNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2;
		int n2=1;
		int n3=3;
		int sumofThreeNumbers=0;
		System.out.println("Enter Max numbers");
		
		Scanner sc= new Scanner(System.in);
		
		int totalNum= sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		while (totalNum>sumofThreeNumbers) {
			sumofThreeNumbers=n1+n2+n3;
			n1=n2;
			n2=n3;
			n3=sumofThreeNumbers;
			//System.out.println(n1);
			//System.out.println(n2);
			System.out.println(n3);		
		}
		
		
		
		

	}

}
