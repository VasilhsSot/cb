package shapes;

public class RightTriangle extends Shape {

//variables=====================================================================
    
    
//constructors==================================================================
    public RightTriangle(){
        super(3);
    }        

//setters & getters=============================================================


//methods=======================================================================
    public int vasi(){
        return Math.abs(getP()[0].getX()-getP()[2].getX());
    }
    
    public int ypsos(){
        return Math.abs(getP()[1].getY()-getP()[0].getY());
    }
    
    @Override
    public double area(){
        return (vasi()*ypsos())/2;
    }
    
    public double hypotenuse(){
        return Math.pow(Math.pow(vasi(), 2)+ Math.pow(ypsos(), 2), 0.5);
    }
    
    @Override
    public double perimeter(){
        return hypotenuse()+vasi()+ypsos();
    }
    
    @Override
    public String toString(){
       return ("Right triangle with A:("+getP()[0].getX()+","+getP()[0].getY()+"), B:("+getP()[1].getX()+","+getP()[1].getY()+") and C:("+getP()[2].getX()+","+getP()[2].getY()+"), has perimeter: "+perimeter()+" and area: "+area()+" !"); 
    }

//main==========================================================================

 

}//~class
