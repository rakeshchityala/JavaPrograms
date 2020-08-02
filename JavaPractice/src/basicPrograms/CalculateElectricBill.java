package basicPrograms;

import java.util.Scanner;

public class CalculateElectricBill {
	public void ElecticBillCalculation() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Previous Meter Reading: ");
	int previousMeterReading  = sc.nextInt();
	System.out.println("Current Meter Reading: ");
	int currentMeterReading = sc.nextInt();
	int unitsConsumed = currentMeterReading-previousMeterReading;
	double billAmount = 0;
	
	if (unitsConsumed>100) {		
		billAmount=(30*2.30)+(70*3.50)+((unitsConsumed-100)*4.60);
		System.out.println(String.format("%.2f", billAmount));
	}
	else if (unitsConsumed>30 && unitsConsumed<=100) {
		billAmount=(30*2.30)+((unitsConsumed-30)*3.50);
		System.out.println(String.format("%.2f", billAmount));
	} 
	else if(unitsConsumed<=30) {
		 billAmount=unitsConsumed*2.3;
		System.out.println(String.format("%.2f", billAmount));
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateElectricBill ceb= new CalculateElectricBill();
		ceb.ElecticBillCalculation();

	}

}
