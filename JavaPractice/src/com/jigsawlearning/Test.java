package com.jigsawlearning;

public class Test {
	public void display (int x, int y) {
		System.out.println(x+y);
	}
	public double display(int p, double q) {
		return (p+q);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.display(4, 5.0);
		System.out.println(test.display(4, 5.0));

	}

}
