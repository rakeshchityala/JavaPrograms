package com.jigsawlearning;

public class Child1 extends Parent{
	protected int var2;
	Child1(int var1, int var2){
		super(var1);
		System.out.println("Child1 Constructor");
		this.var2=var2;
	}

}
