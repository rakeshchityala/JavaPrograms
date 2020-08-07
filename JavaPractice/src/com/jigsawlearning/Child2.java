package com.jigsawlearning;

public class Child2 extends Child1{
	int var3;
	Child2(int var1, int var2, int var3){
		super(var1, var2);
		System.out.println("Child2 Constructor");
		this.var3=var3;
	}
	void display() {
		System.out.println("Parents var1  value="+var1);
		System.out.println("Parents var2  value="+var2);
		System.out.println("Parents var3  value="+var3);
	}

}
