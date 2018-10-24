package askisi24Oktwvri;

import java.util.Scanner;

public class Main {

//variables=====================================================================
public static Scanner in=new Scanner(System.in);

//constructors==================================================================


//setters & getters=============================================================


//methods=======================================================================
    public static void showMenu(){
        System.out.println("\nWhat do you want to do? (choose number from menu) ");
        System.out.println("1. Show empty spots. ");
        System.out.println("2. Park a vehicle. ");
        System.out.println("3. Remove your vehicle from parking. ");
        System.out.println("4. Exit.");
    }
    
    public static Vehicle createV(){
        int s;
        boolean check=true;
        Vehicle v=null;
        in=new Scanner(System.in);
        while (check){
            System.out.println("Is this a 1.car or a 2.motorbike?");             
            s=in.nextInt();
            if (s==1){
                v= new Car();
                check=false;
            }else if(s==2) {
                v= new Bike();
                check=false;
            }else System.out.println("Invalid choice. Please enter 1 for car or 2 for motorbike. ");
        }        
        return v;
    }
    
    public static void registerV(Vehicle v){
        int t=0;
        System.out.println("What's the plate number of your vehicle? ");
        t=in.nextInt();
        v.setAK(t);
        System.out.println("What's the brand of your vehicle? ");
        Scanner in2=new Scanner(System.in);
        String s=in2.nextLine();
        v.setBrand(s);        
        System.out.println("What's the model of your vehicle? ");
        s=in2.nextLine();
        v.setModel(s);
        System.out.println("What's your vehicle's color? ");
        s=in2.nextLine();
        v.setColor(s);        
    }
    
    public static boolean switchCH(int ch, Parking p){
        Vehicle v;
        boolean b=true;
        switch (ch) {
            case 1: p.showAvail(); 
                    break;
            
            case 2: v=createV(); 
                    registerV(v);
                    p.addVehicle(v);
                    System.out.println("A "+v.getColor()+" "+v.getBrand()+" "+v.getModel()+" has been stored to position "+(p.findThesi(v.getAK())+1)+" in the parking on "+v.getTimeIn()+".");
                    Ticket.exportTicket(v, (p.findThesi(v.getAK())+1));
                    break;
                    
            case 3: Scanner sc4= new Scanner(System.in);
                    int s;
                    System.out.println("Please give the plate number of your vehicle... ");
                    s=sc4.nextInt();
                    int kappa=p.findThesi(s);
                    if(kappa==-1){
                        System.out.println("This vehicle is not in here. ");
                    }else{
                        p.removeVehicle(p.getTable()[kappa]);
                     }                    
                    break;
                    
            case 4: b=false;
                    System.out.println("That you for choosing our Parking. ");
                    break;
            default: System.out.println("Invalid input. Please choose 1-4.\n");
                     break;            
        }
        return b;
    }

//main==========================================================================
    public static void main (String args[]){
        Employee e=new Employee("Kwstas");
              
        Parking p=new Parking(e);
        boolean flag=true;
        System.out.println("Welcome to our Parking. \nFor any help, please refer to mr."+p.getE().getName());
        while(flag){            
            showMenu();
            int ch=in.nextInt();
            flag=switchCH(ch,p);
            }
        in.close();        
    }//~main
}//~class
