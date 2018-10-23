package AFDE;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class test11 {
    
//    public static void show(int[][]p){
//        for (int i=0;i<p.length;i++){
//            for (int j=0;j<p.length;j++){
//                System.out.format("| %-3d|", p[i][j]);
//                if(j==p.length-1){System.out.println();}
//            }
//        }
//    }
    
    
    public static void sym(int[][]p){
        for (int i=0;i<p.length;i++){
            for (int j=0;j<p.length;j++){
                if (i>j){p[i][j]=p[j][i];}
            }
        }
    }
    
public static void main (String args[]) throws FileNotFoundException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give the dimension. ");
    int s=sc.nextInt();
    int[][]p=new int[s][s];
    for (int i=0;i<s;i++){
        for (int j=0;j<s;j++){
            if (j>=i){
                System.out.println("Dwse mia timi gia tin "+i+","+j+" thesi toy pinaka");
                p[i][j]=sc.nextInt();
            }
        }
    }
    sc.close();
    
    //dimiourgia symmetrikou
    sym(p);

//    show(p);
    
    PrintWriter writer;
    try {
    writer =new PrintWriter ("symmetrikos.txt", "UTF-8");
        for (int i=0;i<p.length;i++){
            for (int j=0;j<p.length;j++){
                writer.printf("  %-2d\t|", p[i][j]);
                if(j==p.length-1){writer.println("");}
            }
        } writer.close();
    }catch (UnsupportedEncodingException ex){}
}
}
