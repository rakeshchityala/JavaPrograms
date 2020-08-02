package basicPrograms;

import java.util.Scanner;

public class HackerRankSeparateStringsWithEvenOdd {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		//char ch1[]=s1.toCharArray();
		//char ch2[]=s2.toCharArray();
		String evenChars1="";
		String oddChars1="";
		String evenChars2="";
		String oddChars2="";
		//System.out.println("First String "+s1);
		//System.out.println("Second String "+s2);
		
		for (int i=0;i<s1.length();i++) {
			if(i%2==0) {				
				//System.out.println("Even "+s1.charAt(i));
				evenChars1=evenChars1+s1.charAt(i);
				//System.out.println(evenChar);
			}else {
				//System.out.println("Odd " +s1.charAt(i));
				oddChars1=oddChars1+s1.charAt(i);
				//System.out.println(oddChar);
			}
		}
		//System.out.println(evenChars1);
		//System.out.println(oddChars1);
		System.out.println(evenChars1+"  "+oddChars1);
		
		
		for (int i=0;i<s2.length();i++) {
			if(i%2==0) {				
				//System.out.println("Even "+s1.charAt(i));
				evenChars2=evenChars2+s2.charAt(i);
				//System.out.println(evenChar);
			}else {
				//System.out.println("Odd " +s1.charAt(i));
				oddChars2=oddChars2+s2.charAt(i);
				//System.out.println(oddChar);
			}
		}
		//System.out.println(evenChars2);
		//System.out.println(oddChars2);
		System.out.println(evenChars2+"  "+oddChars2);
		
		sc.close();
	}
}
