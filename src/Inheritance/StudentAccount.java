package Inheritance;

public class StudentAccount extends Account {
    
//variables=====================================================================
    private double overdraft;
    
//constructor===================================================================
    public StudentAccount (){}
    
    public StudentAccount(String a, int b, double c, double d, double e){
        super(a,b,c,d);
        this.overdraft=e;
    }
//setters & getters=============================================================

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    
    public static void main (String args[]){
        StudentAccount sa=new StudentAccount("nikos", 30,20.0,30.0,25.00);
        LoanAccount la= new LoanAccount();
        
        
    }
}
