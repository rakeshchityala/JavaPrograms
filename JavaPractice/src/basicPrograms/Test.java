package basicPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
       
        int n=arr.length;        
        int zero=0;
        int positive=0;
        int negative=0;
        arr= new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i]=scanner.nextInt();
            
        }
            
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                zero++;
            }else if (arr[i]>0) {
                positive++;
            }else if (arr[i]<0) {
                negative++;
            }            
        }       
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
        
        //scanner.close();             
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
