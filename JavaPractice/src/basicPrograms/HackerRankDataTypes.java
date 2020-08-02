package basicPrograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankDataTypes {

public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);


    int j = 4;
    double y = 9.0;
    String k = "is the best place to learn and practice coding!";

    Scanner f = new Scanner(System.in);    

    j = Integer.parseInt(f.nextLine());
    y = Double.parseDouble(f.nextLine());
    k = f.nextLine();


    System.out.println(j + i);
    System.out.println(d + y);
    System.out.println(s + k);


           scan.close();
}
}