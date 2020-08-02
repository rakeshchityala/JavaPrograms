package oopsConcepts;

public class ParentInheritenceConcept {
	String color="RED";
	
	public ParentInheritenceConcept() {
		System.out.println("This is Parent Class Constructor");
	}
	
	public void gear() {
		System.out.println("Gears are implemented from Parent");
	}
	
	public void brakes() {
		System.out.println("Brakes are implemented Parent");
	}
	
	public void getData() {
		System.out.println("This is from Parent Class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInheritenceConcept pic= new ParentInheritenceConcept();
		

	}

}
