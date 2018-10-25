package AFDE;

public class Basketball {

//variables=====================================================================
    Ball b= new Ball() {
        @Override
        public void kick(){
            System.out.println("anonymous ball kicked.");
        }
    };
    public static void main (String args[]){
        Basketball ball = new Basketball();
        ball.b.kick(); //prints anonymoys...   on the fly subclass
                       //xrisimopoieitai mono mesw antikeimenoy Basketball
        Ball ballz=new Ball();
        ballz.kick();  // prints Ball kick.
    }

//constructors==================================================================


//setters & getters=============================================================


//methods=======================================================================


//main==========================================================================

}//~class
