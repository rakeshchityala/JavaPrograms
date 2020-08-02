package oopsConcepts;

public class MethodOverloading {
	int a,b,c,d;
	public void add(int a, int b) {
		System.out.println(c=a+b);
	}
	public void add(int a, int b, int c) {
		d=a+b+c;
		System.out.println(d=a+b+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mol=new MethodOverloading();
		
		mol.add(10,20);
		mol.add(10, 20, 30);


	}

}
