package Inheritance;

public class HourlyEmployee extends Employee {

//variables=====================================================================
    private int hours;
    private double rate;

//constructors==================================================================
    public HourlyEmployee(){}
    
    public HourlyEmployee(String name,String surname,String id,String insuranceBody, String jobDesc, int hours, double rate){
        super(name,surname,id,insuranceBody,jobDesc);
        this.hours=hours;
        this.rate=rate;
    }

//setters & getters=============================================================
    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }
        public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public String toString(){
        return "HourlyEmployee"+super.getName()+" gets paid: "+this.pay();
    }
    
    public double pay(){
        return rate*hours;
    }


//methods=======================================================================


//main==========================================================================



}//~class
