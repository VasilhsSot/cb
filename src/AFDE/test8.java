package AFDE;

public class test8 {
    public static void main (String args[]){
        String s= "Strings are immutable";
        s=s.concat(" all the time"); //equal to s = s + " all the time";
        System.out.println(s);
        System.out.println("Length: "+s.length());
        for (String retval: s.split(" ")) {
            System.out.println(retval);
        }
        
        String str2 = new String ("Welcome-to-java-tutorial");
        System.out.println("\nSplit to two pieces :");
        for (String retval: str2.split("-",2)) {
            System.out.println(retval+"     ");
        }
        System.out.println("\n\nSplit to three pieces :");
        
        for (String retval: str2.split("-", 3)) {
            System.out.println(retval+"     ");
        }
        
        System.out.println("\n\nSplit:");
        for (String retval: str2.split("-",0)){
            System.out.println(retval+"     ");
        }
        
        System.out.println(str2.substring(1,10));
        
    }
}
