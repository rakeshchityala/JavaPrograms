package basicPrograms;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("My Default Constructor");
	}
	
	public ConstructorDemo(String str) {
		System.out.println("This constructor is with string parameter");
	}
	
	public ConstructorDemo(int a, int b) {
		System.out.println("This constructor with integer parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo scd=new ConstructorDemo("Rakesh");
		ConstructorDemo icd=new ConstructorDemo(2,3);

	}

}
