package basicPrograms;

import java.util.Scanner;

public class AverageCalculator{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of students");
	int numberOfStudents = sc.nextInt();
	int studentCount[]= new int[numberOfStudents];
	int sumOfStudentMarks=0;
	int AvgStudentMarks=0;
	System.out.println("Enter 5 students marks");
	for (int i=0;i<studentCount.length;i++){
		studentCount[i]=sc.nextInt();
		sumOfStudentMarks=sumOfStudentMarks+studentCount[i];
	}
	AvgStudentMarks=sumOfStudentMarks/5;
	System.out.println(AvgStudentMarks);
sc.close();
}
	
}
