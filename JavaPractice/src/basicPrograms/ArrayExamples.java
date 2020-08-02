package basicPrograms;

import java.util.Arrays;

public class ArrayExamples {
	
	public void sumGlassArray() {
		int[][] i = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		
		
	}
	
	public void sumOfArray() {
		int total=0;
		int[] a = {1,2,3,4,5,6,7,8};
		for (int i=0;i<a.length;i++) {
			total=total+a[i];
			System.out.println(a[i]);
		}
		System.out.println(total);
	}
	
	public void stringArrayExample() {
		
		String s="THis is my first array program";
		String s1[]= s.split("");
		//String[] s2= s.split("");;
		for (int i=0;i<s1.length;i++) {
			int	count=0;
			//System.out.println(s1[i]);
				for (int j=0;j<=s1.length-1;j++) {
					
						if (s1[i].equals(s.charAt(j))) {
							System.out.println(s1[i] + " Character found " );
							count++;
						}
						
				}
				System.out.println("Total occurences " +count);
		
		}
		
		
	}
	
	public void intArrayExample(){
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		values[0]= 10;
		values[1]=20;
		values[2]=30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		for (int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
		int[] numbers = {1,2,3};
		for (int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		
	}	
	
	public static void main (String[] args){
		ArrayExamples ae=new ArrayExamples();
		//ae.intArrayExample();
		//ae.stringArrayExample();
		ae.sumOfArray();
		
		
	}
}
