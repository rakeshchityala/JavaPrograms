package basicPrograms;

import java.util.Scanner;

public class program1 {	
		
	public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        String inputString;
        //2
        System.out.println("Enter a string :");
        inputString = sc.nextLine();
        //3
        System.out.println("Following integers are found in the string : ");
        //4
        for (char ch : inputString.toCharArray()) {
            //5
            if (Character.isDigit(ch)) {
            int indexOdDigit = inputString.indexOf(ch);
            System.out.println("Index of Digit is :" +indexOdDigit);
            	
                System.out.print(ch + " ");
            }
        }
}
}