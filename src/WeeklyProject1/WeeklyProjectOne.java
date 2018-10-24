package weeklyProject1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class WeeklyProjectOne {

public static void main (String args[]) throws FileNotFoundException, IOException{
    //variables for current time and date
    String t = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(Calendar.getInstance().getTime());   //current time
    String d = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()); //current date
    
    //check if 0,1 or >2 arguments given
    if ((args.length==0) || (args.length==1) || args.length>2) {
        System.out.println("Please provide valid arguments. \nargument 1: path to text file \nargument 2: command to apply (wc or find) ");
        return;
    }
    String str1=args[0], str2=args[1];
    File f = new File(str1);
    
    //check if arguments are valid.
    //1st check if argument one is a .txt file, 2nd check if file exists and 3rd check if argument two is valid entry.
    if (!str1.endsWith(".txt")) {   
        System.out.println("Invalid argument 1 entry. \nArgument 1 has to be ONLY a text file that ends with .txt! ");
        return;}
    else {
        if (!f.exists()) {  //check if file exists
        System.out.println(str1+" is not a valid path "); 
        return;}
        else if (!str2.equals("wc") && !str2.equals("find")) {
          System.out.println(t+": File "+str1+" found! \nArgument "+str2+" is invalid. Only wc and find are supported ");
          return;}
    }
    
    
    PrintWriter writer;
    boolean flag=false;
    
    //checking if wordcount.txt file exists    
    File f2 = new File ("wordcount.txt");
    if(!f2.exists()) {flag=true;}
        
    try{
        writer=new PrintWriter(new FileOutputStream(new File("wordcount.txt"),true));  
        if(flag){  //if wordcout.txt doesn't exist add the column names.
            writer.printf("%-20s %-20s %-20s %-20s %-20s \r\n\n", "Date", "Time", "Command", "file", "Result");     
        }
        
        //if argument 2 is "wc" 
        if (str2.equals("wc")){    
        try{
            Scanner sc1 = new Scanner(new FileInputStream(f));
            System.out.println(t+": File "+str1+" found!");
            System.out.println(t+": Total word count started ");
            int count=0;
            while(sc1.hasNext()){
            sc1.next();
            count++;
            } 
            System.out.println(t+": Word count finished. Counted "+count+" words ");
            
            //adding a line to wordcount.txt for the event.
            writer.printf("%-20s %-20s %-20s %-20s %-20d\n", d, t, str2, str1, count);
            sc1.close();
        } catch (FileNotFoundException ex){
            System.out.println(str1+" is not a valid path ");
          } 
        }
        
        //if argument 2 is "find"
        if (str2.equals("find")) {        
        try{
            Scanner sc3 = new Scanner(f);            
            System.out.println(t+": File "+str1+" found!");
            
            //Asking user to enter the word he wants to search and count.
            System.out.println("Enter the word you wish to search in the file: "+str1.substring(0, str1.length()-4));
            Scanner sc2 =new Scanner (System.in);            
            String fw= sc2.nextLine();
            sc2.close();
            
            int sum=0; //total times the word exists in the file.
            String line;
            System.out.println(t+": Counting occerrences of word "+fw);
            while (sc3.hasNext()) {
                line=sc3.next();
                if ((line.toLowerCase().equals(fw.toLowerCase())) || (line.toLowerCase().contains(fw.toLowerCase()))) {
                    sum++;
                }
            }
            sc3.close();
            
            //adding a line to wordcount.txt for the event
            writer.printf("%-20s %-20s %-20s %-20s %-20s\n", d, t, str2, str1, (fw+":"+sum));
            System.out.println(t+": Count of word "+fw+" finished. Occurrences found: "+sum);
        } catch (FileNotFoundException ex){
            System.out.println(str1+" is not a valid path ");
            }
        }
        writer.close();
        }catch (FileNotFoundException ex) {
            System.out.println("Could not create file. ");
        }
    
}
}
