package basicPrograms;

import java.util.Scanner;

public class HackerEarth {
	
        int val  = 10;
        public static void main(String[] args) {
            HackerEarth obj = new HackerEarth();
            System.out.println(obj.val);
            
            
            /* IMPORTANT: Multiple classes and nested static classes are supported */

            /*
             * uncomment this if you want to read input.
            //imports for BufferedReader
            import java.io.BufferedReader;
            import java.io.InputStreamReader;

            //import for Scanner and other utility classes
            import java.util.*;
            */

            // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

           
                   
                    Scanner s = new Scanner(System.in);
                    int numbers = s.nextInt();                 // Reading input from STDIN
                    //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
                    int[] array=new int[numbers];
                    int a=array[0];
                    for (int i=0;i<numbers;i++){
                        array[i]=s.nextInt();
                    
                   
                   
                    if(array[i]<a){
                        a=array[i];
                    }
                    // Write your code here
                    System.out.println(a);
                    }

                }
            

        }
    

