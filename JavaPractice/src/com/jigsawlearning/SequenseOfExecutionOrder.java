package com.jigsawlearning;

public class SequenseOfExecutionOrder {
	private static int empCounter=100;
	private int empId=0;
	{
		System.out.println("init block executed");
	}
	static {
		System.out.println("static block executed");
	}
	public SequenseOfExecutionOrder() {
		System.out.println("Constructor is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SequenseOfExecutionOrder soer=new SequenseOfExecutionOrder();

	}

}
