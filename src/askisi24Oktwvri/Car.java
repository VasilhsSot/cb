package askisi24Oktwvri;

public class Car extends Vehicle {

//variables=====================================================================
    private double rate;

//constructors==================================================================
    public Car (){}
    
    public Car(int AK, String brand, String model, String color){
        super(AK,brand,model,color);
        this.rate=2.0;
    }

//setters & getters=============================================================
    @Override
        public double getRate() {
            return 2.0;
        }

//methods=======================================================================


//main==========================================================================



}//~class
