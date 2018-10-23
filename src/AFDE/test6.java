package AFDE;

public class test6 {
    
    static boolean isPrime (int k){
        boolean flag=true;
        if (k>2){
            for (int i=2;i<k;i++) {
                if(k%i==0) {
                    flag = false;
                    break;
                }                    
            }
        }
        return flag;
    }
    
    public static void main (String args[]){
        for (int i=2;i<2500;i++){
            if (isPrime(i) || (((i%3==0) || (i%8==0))) && !((i%3==0) && (i%8==0)))
            {System.out.print(i+" ");}
            if (i%75==0){System.out.print("\n");}
        }
    }
    
}
