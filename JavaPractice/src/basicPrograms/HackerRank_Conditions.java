package basicPrograms;

import java.util.Scanner;

public class HackerRank_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int N=scan.nextInt();
		 if(N%2==1){
	            System.out.println("Weird");	            
	        }
	        if(N%2==0 && (N <= 5) && (N >= 2)){
	             System.out.println("Not Weird between 2 & 5");
	        }else if (N%2==0 && (N <= 20) && (N >= 6)){
	            System.out.println("Weird between 6 & 20");
	        }else if(N%2==0 && (N >= 20)){
	            System.out.println("Not Weird Greater than 20");
	        }else{
	            System.out.println("Given Number is not within given range");
	        }

	        scan.close();

				

	}

}