package com.jigsawlearning;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Provide a number");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {			
			for (int j=1;j<=i;j++) {
				if(i%3==0) {
					System.out.print("");
				}else {
				System.out.print(i);				
			}
	
		}
			System.out.println("");
		}
		sc.close();

	}

}


