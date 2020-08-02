package basicPrograms;

import java.util.Scanner;

public class SampleTest {	
	
	
	public void evenOdd() {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<N;i++) {
			String str=sc.nextLine();
			char[] chArray = str.toCharArray();

			for (int j=0;j<str.length();j++) {
				if(i%2==0) {	
					System.out.println(chArray[j]);
				}
			}
			System.out.println(" ");		
	
			for (int j = 0; j < chArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(chArray[j]);
                }
            }

            System.out.println();
		}
	sc.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		SampleTest st=new SampleTest();
		st.evenOdd();
				
	}
}

	


