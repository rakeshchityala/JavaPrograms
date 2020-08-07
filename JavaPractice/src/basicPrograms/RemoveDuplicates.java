package basicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of an array");
		int l=Integer.parseInt(br.readLine());
		int []a= new int[l];
		for (int i=0;i<l;i++) {
			System.out.println("Enter an Element");
			int el = Integer.parseInt(br.readLine());
			a[i]=el;
		}
		
		//sorting logic
		for (int i=0;i<l;i++) {
			for (int j=0;j<l-1;j++) {
				if (a[j]>a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		//remove duplicates
		
		int b=0;
		a[b] = a[0];
		for (int i=0;i<l;i++) {
			if (a[b]!=a[i]){
				b++;
				a[b]=a[i];
			}
		}
		for (int i=0;i<=b;i++) {
			System.out.println(a[i]);
		}
		

	}

}
