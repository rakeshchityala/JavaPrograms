package basicPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExceptionsDemo {
	
	public void divideByZero() {
		try {
		int a=10;
		int b=5;
		int c=a/0;
	}catch(Exception ArthimeticException){
		System.out.println("Divided by zero is not a valid case");
	}
		
	}
	
	public void plusMinus(int[] arr) {
		   //int len = arr.length!=0;
		int n=arr.length;		
		int zero=0;
		int positive=0;
		int negative=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
			}else if (arr[i]>0) {
				positive++;
			}else if (arr[i]<0) {
				negative++;
			}			
		}
		//System.out.println("Total zero objects are: "+zero);
		//System.out.println("Total positive attributes are: "+positive);
		//System.out.println("Total negative attributes are: "+negative);
		BigDecimal p1;
		BigDecimal z1,n1,n2;
		p1= new BigDecimal(positive);
		z1=new BigDecimal(zero);
		n1=new BigDecimal(negative);
		n2=new BigDecimal(n);
		p1=p1.divide(n2,n, RoundingMode.CEILING);
		
		z1=z1.divide(n2,n, RoundingMode.CEILING);
		n1=n1.divide(n2,n, RoundingMode.CEILING);
		System.out.println(p1);		
		System.out.println(z1);
		System.out.println(n1);


		    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionsDemo ed=new ExceptionsDemo();
		//ed.divideByZero();
		int[] arr= {-4,3 ,-9, 0 ,4, 1};
		ed.plusMinus(arr);

	}

}
