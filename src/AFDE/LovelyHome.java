package AFDE;

public class LovelyHome {
    
    //inner class an einai private. Xwris private einai apla sublass (den einai to idio me extends)!!!!!!!!!!!!!
    private class ANewClass {
        
    }

//variables=====================================================================
    ANewClass n= new ANewClass(); 
    

//constructors==================================================================
    public LovelyHome (){
        System.out.println("My Lovely Home. ");
        class AClass {  //internal class, not public (apagorevetai 2i public class sto idio arxeio).
            AClass (){  //Eksw apo to swma tou constructor den mporei na tin anagnwrisei.
                System.out.println("AClass");
            }
        }
        AClass aclass = new AClass();
    }
    
    public LovelyHome (String msg){
        System.out.println(msg);
    }

//setters & getters=============================================================


//methods=======================================================================


//main==========================================================================
    public static void main (String args[]){
        System.out.println ("Hello World");
        LovelyHome aGirlyHome = new LovelyHome();
        LovelyHome aGirlyHome2= new LovelyHome("A home");
    }
}//~class LovelyHome
 class AClass { //internal class (ektos swmatos LovelyHome). Leitourgei san subclass. (Den einai to idio me to EXTENDS)!!!!!
     public AClass(String n){
         //super(n); Den kanei inheritance tin apo panw.. prepei na yparxei to Extends.
     }
 }
