package caveOfProgrammming;

public class RecursionFactorial {
	
	public static int factorial(int value) {
		if(value==1) {
			return 1;
		}
		return factorial(value-1)*value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(4));

	}

}
