package weeklyProject2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCatalog {
//variables=====================================================================
   private int []telCatalog;
   private String [] nameCatalog;
   private int capacity;
   private int  index; //current position for new entry.

//constructors==================================================================
    public MyCatalog() {
        index=0;
    }
    public MyCatalog(int capacity){
        telCatalog=new int[capacity];
        nameCatalog=new String[capacity];
        index=0;
        this.capacity=capacity;
    }

//setters & getters=============================================================
    public int getCapacity() {    
        return capacity;
    }
    
    public int[] getTelCatalog(){
        return telCatalog;
        
    }

    public String[] getNameCatalog() {
        return nameCatalog;
    }

    public void setTelCatalog(int[] telCatalog) {
        this.telCatalog = telCatalog;
    }

    public void setNameCatalog(String[] nameCatalog) {
        this.nameCatalog = nameCatalog;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }    
    
        
//methods=======================================================================
    public void showCatalog() {
        for (int i=0;i<capacity;i++){
            System.out.println((i+1)+": "+nameCatalog[i]+" - "+telCatalog[i]+" .");                    
        }
    }
    
    public static int countFile(String name) throws IOException {
        int sum=0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(name));
            while (reader.readLine()!= null) sum++;
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. ");
            }
        return sum;
    }    
    
    public int searchArray(String name){
        for (int i=0;i<index;i++){
            if (nameCatalog[i].equals(name)) return i;
        }
        return -1;
    }
    
    public int searchArray(int tel){
        for (int i=0;i<capacity;i++){
            if (telCatalog[i]==tel) return i;
        }
        return -1;
    }
    
    public void copyAndSwapTables (int[]t, int []p){
        for (int i=0;i<p.length;i++){
            t[i]=p[i];
        }
        p=t;
    }
    
    public void copyAndSwapTables (String[]t, String []p){
        for (int i=0;i<p.length;i++){
            t[i]=p[i];
        }
        p=t;
    }
          
    public void doubleCatalog (MyCatalog m){
        if (index==capacity){
            capacity=capacity*2;
            int temp1[]=new int [capacity];
            String temp2[]=new String [capacity];
            for (int i=0;i<nameCatalog.length;i++){
                temp1[i]=telCatalog[i];
                temp2[i]=nameCatalog[i];
            }
            telCatalog=temp1;
            nameCatalog=temp2;           
        }
    }
    
    public void halfCatalog(MyCatalog m){
        if (index-1==capacity/2 || index-1<capacity/2){
            capacity= capacity/2;
            int []temp1 = new int[capacity];
            String []temp2=new String[capacity];
            for (int i=0;i<temp1.length;i++){
                temp1[i]=telCatalog[i];
                temp2[i]=nameCatalog[i];
            }
            telCatalog=temp1;
            nameCatalog=temp2;
        }
    } 
    
    public void CreateEntry (String name, int tel) {
        int k=searchArray(name);
        if(k==-1){
            doubleCatalog(this);
            telCatalog[index]=tel;
            nameCatalog[index]=name;
            index++;
        }else {telCatalog[k]=tel;} //if name already exists in the catalog, just update the number.
    }
    
    public static int extractInt(String str) {
        Matcher matcher = Pattern.compile("\\d+").matcher(str);

        if (!matcher.find())
            throw new NumberFormatException("For input string [" + str + "]");

        return Integer.parseInt(matcher.group());
    }
    
    public void readFile(String name) throws IOException{
        String line;
        try {
            File f = new File (name);
            BufferedReader b = new BufferedReader (new FileReader(f));
            String readLine="";
            while((readLine=b.readLine())!=null){
                nameCatalog[index]= readLine.substring( 0, readLine.indexOf(","));
                telCatalog[index]= extractInt(readLine.substring(readLine.indexOf(",")+1, readLine.length()));
                index++;
            }
            b.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("File not found. ");
            }//~try-catch
    }
    
    public boolean updateEntry(String name){
        int k= searchArray(name);
        if (k==-1) {
            System.out.println("The catalog doesn't contain the name "+name+" !");
            return false;
        }else {
        System.out.println("What's the new number for name: "+name+" ?");
        Scanner sc2= new Scanner(System.in);
        int n= sc2.nextInt();
        telCatalog[k]=n;
        sc2.close();
        return true;
        }
    }
    
    public boolean updateEntry(int n){
        int k=searchArray(n);
        if (k==-1) {
            System.out.println("The catalog doesn't contain the number ");
            return false;
        }else {
            System.out.println("What's the new name for the telephone number: "+n+" ?");
            Scanner sc3=new Scanner(System.in);
            String s=sc3.nextLine();
            nameCatalog[k]=s;
            sc3.close();
            return true;
        }
    }
    
    public boolean deleteEntry(String name){
        int k=searchArray(name);
        if (k==-1){
            System.out.println("The catalog doesn't contain name: "+name+" !");
            return false;
        }else {
            //delete entry and put at that position the last entry of the catalog.
            telCatalog[k]=telCatalog[index-1];
            telCatalog[index-1]=0;
            nameCatalog[k]=nameCatalog[index-1];
            nameCatalog[index-1]=null;
            halfCatalog(this);
            index--;
            return true;
        }
    }
    
    public boolean deleteEntry(int tel){
        int k=searchArray(tel);
        if (k==-1){
            System.out.println("The catalog doesn't contain telephone number: "+tel+" !");
            return false;
        }else {
            halfCatalog(this);
            //delete entry and put at that position the last entry of the catalog.
            telCatalog[k]=telCatalog[index-1];
            nameCatalog[k]=nameCatalog[index-1];
            nameCatalog[k]=nameCatalog[index-1];
            nameCatalog[index-1]=null;
            index--;
            return true;
        
        }
    }

//main==========================================================================
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //count how many etries the .txt file has and then create a catalog of that size.
        int lines=countFile("telcatalog.txt");
        MyCatalog a=new MyCatalog(lines);
        
        //insert these entries to the catalog.
        a.readFile("telcatalog.txt");
        
        System.out.println ("---TESTING----");        
        System.out.println("\nFirst check if the catalog created successfully after reading the file. ");
        a.showCatalog(); //successful
        
        //delete entry and show again catalog.
        System.out.println("\nDelete 10: THOMAS from catalog and putting 13: PAUL there. Place 13: now is empty.");
        a.deleteEntry("THOMAS");
        a.showCatalog();//successful
        
        //create new entry and put it to the end.
        System.out.println("\n Creating entry 13: VASILHS - 35358..");
        a.CreateEntry("VASILHS",35358);
        a.showCatalog();//successful
        
        //deleting an entry that doesn't exist in catalog.
        System.out.println("\nDeleting entry \"KATERINA\" that doesn't exist in the catalog. Catalog remains the same. ");
        a.deleteEntry("KATERINA");
        a.showCatalog();//successful
        
        //creating an entry that already exists in the catalog. it will just update the number of that entry
        System.out.println("\nCreating entry \"PAUL\" which already exists in the catalog. Will just update number instead. ");
        System.out.println("It will update PAUL's number from 13678 to 99890 using the createEntry method. ");
        a.CreateEntry("PAUL",99890);
        a.showCatalog(); //successful        
        
        //update an entry by giving the name.
        System.out.println("\nUpdating entry \"VASILHS\", changing the number from 35358 to 878878. ");
        a.updateEntry("VASILHS");
        a.showCatalog();//successful
        
        //creating 3 more entries to check that the size of the catalog gets double with null names and 0 numbers.
        System.out.println("\nCreating 3 more entries 14:\"MITSOS\", 15:\"STAMATIS\" and 16:\"MPARMPASTATHIS\". ");
        a.CreateEntry("MITSOS",900988);
        a.CreateEntry("STAMATIS",56657);
        a.CreateEntry("MPARMPASTATHIS",87677);
        a.showCatalog();//successful
        
        //delete other 3 entries to check if size comes back to half (initial).
        System.out.println("\nDeleting 3 entries 12:DANIEL, 11:CHRISTOPHER, 1:JAMES. ");
        a.deleteEntry("DANIEL");
        a.deleteEntry("CHRISTOPHER");
        a.deleteEntry("JAMES");
        a.showCatalog(); //successful
        
    }//~main
}//~class
