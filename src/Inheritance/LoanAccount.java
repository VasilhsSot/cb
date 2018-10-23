package Inheritance;

public class LoanAccount extends Account {
    
//variables=====================================================================
    private double instalement;
 
//constructors==================================================================
    public LoanAccount(){}
    
    public LoanAccount(String a,int b,double c,double d, double e){
        super(a,b,c,d);
        this.instalement=e;
    }
//setters & getters=============================================================

    public double getInstalement() {
        return instalement;
    }

    public void setInstalement(double instalement) {
        this.instalement = instalement;
    }
    
}
