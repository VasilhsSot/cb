package askisi24Oktwvri;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Parking implements Chargable {

//variables=====================================================================
    private Vehicle []table;
    private String[] avail;
    private Employee e;
    
    
    
//constructors==================================================================
    public Parking (){
        table=new Vehicle[50];
        avail=new String[50];
        for (int i=0;i<avail.length;i++){
            avail[i]="free";
        }
    }
    
    public Parking (Employee e){
        table=new Vehicle[50];
        avail=new String[50];
        for (int i=0;i<avail.length;i++){
            avail[i]="free";
        }
        this.e=e;
    }
    

//setters & getters=============================================================
    public Vehicle[] getTable(){    
        return table;
    }

    public void setTable(Vehicle[] table) {
        this.table = table;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public String[] getAvail() {
        return avail;
    }

    public void setAvail(String[] avail) {
        this.avail = avail;
    }
    
    

//methods=======================================================================
    public int findKeniThesi() {
        int thesi=-1;
        for (int i=0;i<table.length;i++){
            if (table[i]==null){
                thesi =i;
                break;
            }
        }
        return thesi;
    }
    
    public int findThesi(int arithmos){
        int t=-1;
        for (int i=0;i<this.getTable().length;i++){
            if (this.getTable()[i]==null){break;}
            else{
                if (this.getTable()[i].getAK()==arithmos){
                    t=i;
                    break;
                }
            }
        }
        return t;
    }
    
    public void addVehicle(Vehicle c){
        int k=this.findKeniThesi();
        if (k==-1){System.out.println("We are full!!!! ");}
        else {
            table[k]=c;
            avail[k]="taken";
            String temp=new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
            c.setTimeIn(temp);
        }
    }
    
    public void removeVehicle(Vehicle c){
        int k=this.findThesi(c.getAK());
        if (k==-1) {
            System.out.println("This vehicle is not in here. ");
        } else {
            this.getTable()[k]=null;
            avail[k]="free";
            String temp= new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
            c.setTimeOut(temp);
            DecimalFormat df=new DecimalFormat("#.##");
            System.out.println("Your vehicle has been removed from parking. ");
            System.out.println("Your total payment is "+df.format(pay(c))+" !");
        }
    }
    
    public void showAvail(){
        for (int i=0;i<this.getAvail().length;i++){
            
            System.out.println("Position "+(i+1)+"."+this.getAvail()[i]+" .");
        }
    }
    
    @Override
    public double pay(Vehicle c){        
        double k= c.getRate()*c.diffTime()*FPA;
        return k;
    }
    

//main==========================================================================
//    public static void main (String args[]){
//        Parking p=new Parking();
//        Vehicle v1=new Car();
//        String temp= new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
//        v1.setTimeIn(temp);
//        v1.setTimeOut("24/10/2018 18:55");
//        DecimalFormat df=new DecimalFormat("#.##");
//
//        System.out.println("Rate="+v1.getRate()+" Total payment: "+df.format(p.pay(v1)));
//    }//~main
}//~class
