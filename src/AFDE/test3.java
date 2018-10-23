package AFDE;

import java.util.Scanner;

public class test3 {
    final static double miles=1.150779;
    final static double km=1.852;
    
    static void calculate (double x){
        System.out.println(x+" nautical miles equal to "+(x*km)+" kms or to "+(x*miles)+" miles!");
    }
    
public static void main (String args[]){
    System.out.println("How many nautical miles you want to convert? ");
    Scanner s = new Scanner (System.in);
    double x = s.nextDouble();
    calculate(x);
    s.close();
}
}