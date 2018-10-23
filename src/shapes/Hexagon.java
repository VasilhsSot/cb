package shapes;

public class Hexagon extends Shape {

//variables=====================================================================


//constructors==================================================================
    public Hexagon(){
        super(6);
    }

//setters & getters=============================================================


//methods=======================================================================
    public double sideAB(){
        return Math.abs(this.getP()[1].getX()-this.getP()[0].getX());
    }
    public double perimeter(){
        return sideAB()*6;
    }
    
    public double area(){
        return ((3*Math.pow(3,0.5))/2)*Math.pow(sideAB(), 2);
    }
    
//main==========================================================================

}//~class
