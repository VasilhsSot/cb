package AFDE;
import java.util.Scanner;
public class test5 {
    
    static void showNorm(double[]k){
        for (int i=0;i<k.length;i++){
            System.out.println("To "+(i+1)+"o stoixeio: "+k[i]);
        }
    }
    static void showRev(double[]k){
        for (int i=k.length-1;i>=0;i--){
            System.out.println("To "+(i+1)+"o stoixeio: "+k[i]);
        }
    }
    
    static void fill(double[]k){
        Scanner s = new Scanner(System.in);
        System.out.println("\n-Gemisma pinaka.");
        for (int i=0;i<k.length;i++){
            System.out.println("Parakalw dwste to "+(i+1)+"o stoixeio toy pinaka.. ");
            k[i]= s.nextDouble();
        }
        s.close();
    }
    
    public static void main (String args[]){
        double [] p=new double [11];
        fill(p);
        System.out.println("\nO pinakas se kanoniki seira: ");
        showNorm(p);
        System.out.println("\nO pinakas se antistrofi seira: ");
        showRev(p);
    }
}
