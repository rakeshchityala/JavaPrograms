package basicPrograms;

import java.util.Scanner;

public class HackerrankClassAndInstance {
	static int age;
	static Scanner scan;
	public HackerrankClassAndInstance(int initialAge) {
		if(age<0) {			
			System.out.println("Age is not valid, setting age to 0.");	
			age=initialAge;
			age=0;
		}	
	}
	public void amIOld() {
		if(age<13)	{
			System.out.println("You are young.");
		}else if(age<=13 && age<18){
			System.out.println("You are a teenager.");
		}else {
			System.out.println("You are old.");			
		}
	}
	
	public void yearPasses() {
		age++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan=new Scanner(System.in);
		age =scan.nextInt();
		HackerrankClassAndInstance hcai=new HackerrankClassAndInstance(age);
		hcai.amIOld();
		hcai.yearPasses();
		
		scan.close();
		

	}

}
