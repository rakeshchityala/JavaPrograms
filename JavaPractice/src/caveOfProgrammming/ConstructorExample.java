package caveOfProgrammming;

public class ConstructorExample {
	private String s;
	private int i;

	public ConstructorExample() {
		this("With String Param from First constructor");
		System.out.println("This is running as contructor without parameters");
	}
	public ConstructorExample(String s) {
		this("Rakesh Reddy", 9);
		System.out.println("This is a constructor with String parameter");
		this.s=s;
		System.out.println(s);
	}
	
	public ConstructorExample(String s, int i) {
		System.out.println("This is a constructor with String and int as parameters");
		this.s=s;
		this.i=i;
		System.out.println(s +" "+ i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample ce=new ConstructorExample();	
		ConstructorExample ceStringParameter=new ConstructorExample("Rakesh");	
		ConstructorExample ceStringAndIntParams=new ConstructorExample("Chityala", 6);	



	}

}
