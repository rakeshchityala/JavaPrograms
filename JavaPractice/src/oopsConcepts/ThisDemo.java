package oopsConcepts;

public class ThisDemo {
	int a= 5;
	
	public void getData() {
		int b=9;
		System.out.println("This is a test "+b);
		System.out.println("This is a test using this KeyWord to access current object " +this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td= new ThisDemo();
		td.getData();

	}

}
