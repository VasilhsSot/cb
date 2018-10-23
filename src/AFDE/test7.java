package AFDE;

public class test7 {
    public static void main(String args[]){
        String str1 =new String ("This is really not immutable!!");
        String str2= str1;
        String str3= new String ("This is really not immutable!!");
        boolean retVal;
        
        System.out.println(str1==str2);
        
        
        retVal= str1.equals(str2);
        System.out.println (retVal);
        
        retVal=str1.equals(str3);
        System.out.println(retVal);
    }
}
