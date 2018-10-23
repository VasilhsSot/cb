package Inheritance;

public abstract class Phone {

//variables=====================================================================
    private String brand;
    protected double price;

//constructors==================================================================
    public Phone(){}
    
    public Phone(String brand){
        this.brand=brand;
        price=0.0;
    }

//setters & getters=============================================================

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void setPrice(double price);
    
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }


//methods=======================================================================


//main==========================================================================
    public static void main(String args[]){
        Phone p;
        p=new Android("Samsung");
        Phone n= new NonAndroid("IPhone");
        System.out.println("Price of an Android "+p.getBrand()+" is "+p.getPrice()+" euros. ");
        System.out.println("Price of a NonAndroid "+n.getBrand()+" is "+n.getPrice()+" euros. ");
    }

}//~class
