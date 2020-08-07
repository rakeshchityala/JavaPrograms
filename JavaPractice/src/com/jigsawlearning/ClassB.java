package com.jigsawlearning;

public class ClassB extends ClassA{
	
		int i=12;
		
		public void printValue() {
			System.out.println("From Class B value"+" "+i);
			System.out.println("From Class B value with Super Keyword"+" "+super.i);
			System.out.println("From Class B ValueB");
		}

	}



