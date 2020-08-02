package basicPrograms;

import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long sum = 0;
	        
	        for(int i = 0; i < n; i++){
	            sum += in.nextLong();
	        }
	        
	        System.out.print(sum);
	        in.close();    

	}

}
