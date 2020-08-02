package basicPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	public void multiplicationTable() {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int k=0;
		for (int i=1;i<=10;i++) {
		k=n*i;
			System.out.println(n +"x"+ i +"="+k);
		}
		scan.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable mt=new MultiplicationTable();
		mt.multiplicationTable();

	}

}
