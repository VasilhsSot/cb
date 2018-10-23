package Inheritance;

public class SalaryEmployee extends Employee {

//variables=====================================================================
    private double salary;

//constructors==================================================================
    public SalaryEmployee(){}
    
    public SalaryEmployee(String name,String surname,String id,String insuranceBody, String jobDesc, double salary){
        super(name,surname,id,insuranceBody,jobDesc);
        this.salary=salary;
    }

//setters & getters=============================================================

    public void setSalary(double salary) {
        this.salary = salary; 
    }
    public double getSalary() {
        return salary;
    }
    

//methods=======================================================================
    @Override
    public double pay(){
        return salary;
    }
    
    @Override
    public String toString(){
        return "SalaryEmployee"+super.getName()+" gets paid: "+pay();
    }

//main==========================================================================


}//~class
