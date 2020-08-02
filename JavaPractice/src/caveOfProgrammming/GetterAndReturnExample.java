package caveOfProgrammming;

public class GetterAndReturnExample {
	int age;
	String name;
	
	void speak() {
		System.out.println("My name is: " +name);
	}
	
	int calculateRetirmentAge() {
		int ageLeft=65-age;
		return ageLeft;
	}
	
	int getAge() {
		return  age;
	}
	
	String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		GetterAndReturnExample gare=new GetterAndReturnExample();
		gare.age=25;
		gare.name= "Rakesh";
		gare.speak();
		int retiementAgleft=gare.calculateRetirmentAge();
		System.out.println(retiementAgleft);
		gare.getAge();
		gare.getName();
	}

}
