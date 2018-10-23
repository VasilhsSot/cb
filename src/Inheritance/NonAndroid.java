package Inheritance;

public class NonAndroid extends Phone {

//variables=====================================================================


//constructors==================================================================
    public NonAndroid(){}
    
    public NonAndroid(String brand){
        super(brand);
        this.price=37.99;
    }

//setters & getters=============================================================
    public void setPrice(double price){
        super.price=price;
    }
//methods=======================================================================


//main==========================================================================

}//~class
