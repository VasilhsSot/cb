package AFDE;
import java.util.Scanner;

public class test4 {
    
    public static void main (String args[]){
        int p[]=new int[1000];
        for (int i=0;i<p.length;i++){
            p[i]=2*(i+1);
        }
        boolean flag = true;

        while(flag) {
            System.out.println("Give an even number you want to search in the table please. (2-2000) ");
            Scanner s=new Scanner (System.in);
            int n= s.nextInt();
            if (n%2==0){
            for (int i=0;i<p.length;i++){
                if (p[i]==n) {
                    System.out.println("This number is in "+i+" place in the table");
                    flag=false;
                    break;
                }
            }
            } else {System.out.println(n+" is not an even number. ");}
            s.close();
        }
        
    }
    
}

