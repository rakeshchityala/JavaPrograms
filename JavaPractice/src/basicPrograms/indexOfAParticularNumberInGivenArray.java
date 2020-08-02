package basicPrograms;

import java.util.Scanner;

public class indexOfAParticularNumberInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enterRandomNUmber;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a  Number: ");
		int arrayNumber = sc.nextInt();
		int a[]={4,7,8,9,4};
		for(int i=0;i<a.length;i++){
			if(a[i]==arrayNumber){
				System.out.println("Array is mtched with" +a[i]);
			}else{
				System.out.println("Please enter a number whihc is present in the array list");
			}
			
			
		}

	}

}
