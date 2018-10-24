package askisi24Oktwvri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ticket {

//variables=====================================================================
   private static PrintWriter w;
   public static int index=0;
//constructors==================================================================


//setters & getters=============================================================


//methods=======================================================================
   public static void exportTicket(Vehicle v, int k){
       try{
       w=new PrintWriter(new FileOutputStream(new File("#"+index+" Ticket.txt")));
       w.write("#"+index+" Ticket details (please keep it until you leave)\n\n\tColor: "+v.getColor()+"\n\tBrand: "+v.getBrand()+"\n\tModel: "+v.getModel()+"\n\tPlate number: "+v.getAK()+"\n\tStored to position '"+k+"'\n\tDate: "+v.getTimeIn()+"\n\nThank you for choosing us!!");
       }catch(FileNotFoundException e){e.printStackTrace();}
       index++;
       w.close();
   }

//main==========================================================================

}//~class
