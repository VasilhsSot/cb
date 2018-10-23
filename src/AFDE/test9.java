package AFDE;
import java.util.Scanner;
public class test9 {
 public static void main (String argsp[]){
     String str;
     int n=0;
     Scanner s= new Scanner(System.in);
     System.out.println("What your favourite movie quote?");
     str=s.nextLine();
     s.close();
     System.out.println("Quote is: \""+str+"\" !");
     for (int i=0;i<str.length();i++){
         if (str.charAt(i)==' ') n++;
     }
     System.out.println("Total number of spaces is: "+n);
 }
}
