package oopsConcepts;

public class AusTrafficSystem implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AusTrafficSystem ats= new AusTrafficSystem();
		ats.redStop();
		ats.yellowGetReadyToGo();
		ats.greenGo();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo Implementation");
		
	}

	@Override
	public void yellowGetReadyToGo() {
		// TODO Auto-generated method stub
		System.out.println("yellowGetReadyToGo Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");

		
	}

}
