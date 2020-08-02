package oopsConcepts;

public class ChildInheritenceConcept extends ParentInheritenceConcept{
	
	public ChildInheritenceConcept() {
		super();
		System.out.println("This is Child Class Constructor");
	}
	
	public void engine() {
		System.out.println("New Engine from ChildInheritenceConcept Class");
	}
	
	public void color() {
		System.out.println(color);
	}
	
	public void brakes() {
		System.out.println("Brakes from Child Class");
	}
	
	public void getData() {
		//super.getData();
		System.out.println("This is from Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritenceConcept cic=new ChildInheritenceConcept();
		cic.color();
		cic.engine();
		cic.brakes();
		cic.gear();
		cic.getData();

	}

}
