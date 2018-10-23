package AFDE;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {
    
    //anadromikos algorithmos fibonacci.
    public static int fibonacciOne(int n){
        if(n==0 ||n==1){ return n;}
        else return fibonacciOne(n-1)+fibonacciOne(n-2);
    }
    
    //mi anadromikos algorithmos fibonacci.
    public static long fibonacciTwo(int n){
        long sum=0,k=1,p=0;
        if (n==0 || n==1) { return n;}
        else {for(int i=2;i<n+1;i++) {
                sum=p+k;
                p=k;
                k=sum;
            }
        }
        return sum;
    }
    
    //emfanisi tis seiras fibonacci mexri ton arithmo pou exei dothei. (me xrisi mi anadromikou algorithmou)
    public static void showFib(int n){
        for (int i=0;i<=n;i++){
            System.out.print(fibonacciTwo(i)+" ");
            if (i!=0 && i%10==0){System.out.print("\n");}   //allagi grammis kathe 10 stoixeia.
        }
    }
    
    public static void main (String args[]){
        Scanner s=new Scanner (System.in);
        System.out.println("Please give a number to find and show its fibonacci sequence. ");
        int k= s.nextInt(); //eisagwgi arithmou apo ton xristi.
//        System.out.println("Answer using recursion: "+fibonacciOne(k));
        System.out.println("Answer without using recursion: "+fibonacciTwo(k));
        showFib(k); //emfanisi seiras.
        s.close();
    }
}
