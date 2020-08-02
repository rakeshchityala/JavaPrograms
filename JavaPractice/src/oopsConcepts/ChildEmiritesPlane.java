package oopsConcepts;

public class ChildEmiritesPlane extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmiritesPlane cep=new ChildEmiritesPlane();
		cep.engine();
		cep.safetyGuideLines();
		cep.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
		
	}

}
