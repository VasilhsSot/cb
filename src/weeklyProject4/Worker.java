package weeklyProject4;

public class Worker extends Human {
//variables=====================================================================
    private double week_salary;
    private double work_hours;

//constructors==================================================================
    public Worker(){
        week_salary=0.0;
        work_hours=0.0;
    }



//setters & getters=============================================================
    public void setWork_hours(double work_hours) {
        this.work_hours = work_hours;
    }
    
    public void setWeek_salary(double week_salary) {
        this.week_salary = week_salary;
    }
    
    public double getWeek_salary() {
        return week_salary;
    }

    public double getWork_hours() {
        return work_hours;
    }
//methods=======================================================================
    @Override
    public String toString(){
        return ("First Name: "+super.getFirst_name()+"\nLast Name: "+super.getLast_name()+"\nWeek Salary: "+this.getWeek_salary()+"\nHours Per Day: "+this.getWork_hours()+"\nSalary Per Hour: "+((this.getWeek_salary()/5)/this.getWork_hours())+"\n");
    }
//main==========================================================================

}//~class
