package JigSawLearning;

import java.util.Scanner;

public class CircleData {
	static final String DIAMETER_CODE= "DIA";
	static final String AREA_CODE = "AR";
	static final String PERIMETER_CODE = "PER";
	static final String AREAOFSEMICIRCLE_CODE = "ARSEM";
	static final double PIE_VALUE = 3.14;
	
	public void radiusOfCircle () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int Radius = sc.nextInt();
		System.out.println("Enter Circle Code: ");
		String CircleCode= sc.next();
		
		if(CircleCode.equals(DIAMETER_CODE)) {
			double DiameterOfCircle = 2 * Radius;
			System.out.println("Diameter of Circle is: " + DiameterOfCircle);			
		} else if(CircleCode.equals(AREA_CODE)) {
			double ArearOfCircle = PIE_VALUE*Radius*Radius;
			System.out.println("ArearOfCircle is: " +String.format("%.2f",ArearOfCircle));			
		}else if (CircleCode.equals(PERIMETER_CODE)) {
			double PerimeterOfCircle = 2*PIE_VALUE*Radius;
			System.out.println("Perimeter if Circle is:"  +String.format("%.2f", PerimeterOfCircle));			
		}else if (CircleCode.equals(AREAOFSEMICIRCLE_CODE)) {
			double AreaOfSemiCircle = PIE_VALUE*Radius;
			System.out.println("Area fo Semi Circle is:" +String.format("%.2f", AreaOfSemiCircle));			
		}else {
			System.out.println("Enter valid Radius and Circle code");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleData cd= new CircleData();
		//cd.radiusOfCircle(5, "DIA");
		cd.radiusOfCircle();

	}

}
