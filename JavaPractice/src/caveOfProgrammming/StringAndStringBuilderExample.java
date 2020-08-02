package caveOfProgrammming;

public class StringAndStringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String info = "";
		info += "I'm Learning Java Programming";
		info += " ";
		info += "From Udemy";
		System.out.println(info);
		
		StringBuilder sb= new StringBuilder();
		sb.append("This a string using String Builder");
		sb.append(" ");
		sb.append("E-Learning from Udemy");		
		System.out.println(sb.toString());
		
		StringBuilder sb1= new StringBuilder();
		sb1.append("This a string");
		sb1.append(" ");
		sb1.append("E-Learning from Udemy from another StringBuilder object");		
		System.out.println(sb1.toString());
		
		System.out.println("This a sample text \t this was tab \n this was a next line");
		System.out.printf("Total cost %-5d", 150);
		
		System.out.printf("\nTotal cost is %-2d; total quantity is %2d", 12 ,5);
		
		System.out.printf("\nTotal value in decimal %f", 12.0);
		
		System.out.printf("\nTotal value with specific decimal values %.10f", 12.0);
		
		System.out.printf("\nTotal value: %-6.1f", 343.23423);
		

	}

}
