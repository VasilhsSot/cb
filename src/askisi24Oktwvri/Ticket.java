package askisi24Oktwvri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ticket {

//variables=====================================================================
   private static PrintWriter w;

//constructors==================================================================


//setters & getters=============================================================


//methods=======================================================================
   public static void exportTicket(Vehicle v, int k){
       try{
       w=new PrintWriter(new FileOutputStream(new File("ticket.txt")));
       w.write(v.getColor()+" "+v.getBrand()+" "+v.getModel()+" with plate number: "+v.getAK()+" has been stored to position "+k+" in the parking on "+v.getTimeIn()+".");
       }catch(FileNotFoundException e){e.printStackTrace();}
       w.close();
   }

//main==========================================================================

}//~class
