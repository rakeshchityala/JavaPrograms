package basicPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MinusPlusProgram {
	public void plusMinus() {		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int zero=0;
		int positive=0;
		int negative=0;
		int[] a= new int[n];
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
			
		for (int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zero++;
			}else if (a[i]>0) {
				positive++;
			}else if (a[i]<0) {
				negative++;
			}			
		}
		System.out.println("Total zero objects are: "+zero);
		System.out.println("Total positive attributes are: "+positive);
		System.out.println("Total negative attributes are: "+negative);
		BigDecimal p1;
		BigDecimal z1,n1,n2;
		p1= new BigDecimal(positive);
		z1=new BigDecimal(zero);
		n1=new BigDecimal(negative);
		n2=new BigDecimal(n);
		p1=p1.divide(n2,n, RoundingMode.CEILING);
		
		z1=z1.divide(n2,n, RoundingMode.CEILING);
		n1=n1.divide(n2,n, RoundingMode.CEILING);
		System.out.println("Postive number division: "+p1);		
		System.out.println("ZERO number division: "+z1);
		System.out.println("Negative number division: "+n1);	
		
		
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinusPlusProgram mpp=new MinusPlusProgram();
		mpp.plusMinus();

	}

}
