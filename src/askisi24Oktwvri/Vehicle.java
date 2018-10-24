package askisi24Oktwvri;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Vehicle {

//variables=====================================================================
    private int AK;
    private String brand;
    private String model;
    private String color;
    private String timeIn;
    private String timeOut;

//constructors==================================================================
    public Vehicle(){}
    
    public Vehicle(int AK, String brand, String model, String color){
        this.AK=AK;
        this.brand=brand;
        this.color=color;
        this.model=model;
    }




//setters & getters=============================================================
    public String getTimeOut() {    
        return timeOut;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getTimeIn() {
        return timeIn;
    }
    public int getAK(){
        return AK;
    }

    public void setAK(int AK) {
        this.AK = AK;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    
    public abstract double getRate();
    
    
    
//methods=======================================================================

    public double diffTime(){
        Date d1=null;
        Date d2=null;
        double diff=0.0;
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try{
            d1=format.parse(this.getTimeIn());
            d2=format.parse(this.getTimeOut());
        }catch (ParseException e){
            e.printStackTrace();
        }
        diff=d2.getTime()-d1.getTime();
        return diff/(60*60*1000);
    }
    
    
//main==========================================================================

}//~class
