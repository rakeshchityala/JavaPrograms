package caveOfProgrammming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String fileName= "X:/example.txt";
		File textFile = new File(fileName);
		Scanner scan= new Scanner(textFile);
		//System.out.println(scan.nextLine());
		int intValue= scan.nextInt();
		System.out.println(intValue);
		int count=0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			
			System.out.println(count + ":" + line);
			count++;
		}
		scan.close();

	}

}
