package basicPrograms;

import java.util.Scanner;


public class DiagonalDifference1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = Integer.parseInt(in.nextLine());
		long diff = 0;
		for(int i=0; i < N; i++) {
			String[] row = in.nextLine().split(" ");
			diff += (Integer.parseInt(row[i]) - Integer.parseInt(row[N - 1 - i]));
		}
		
		System.out.println(Math.abs(diff));
		
		in.close();
	}
}