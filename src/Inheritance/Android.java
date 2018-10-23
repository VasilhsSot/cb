package Inheritance;

public class Android extends Phone {

//variables=====================================================================


//constructors==================================================================
    public Android(){}
    
    public Android(String name){
        super(name);
        super.price=24.99;
    }

//setters & getters=============================================================
    public void setPrice(double price){
        super.price=price;
    }

//methods=======================================================================


//main==========================================================================

}//~class
