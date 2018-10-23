package shapes;

public class Circle extends Shape {
    
//variables==========================================================================================================================
    private double radius;
        
//constructors=================================================================================================================
    public Circle (){ }
    
    public Circle (double radius){
        super(1);
        this.radius=radius;
    }
    
    
//setters & getters==================================================================================================================
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//methods==================================================================================================
    @Override
    public double perimeter(){
        return 2*3.14*radius;
    }
    
    @Override
    public double area(){
        return 3.14*Math.pow(radius, 2);
    }
    
//    @Override
//    public void addP(Point point){
//        super.getP()[super.getIndex()]=point;
//        super.setIndex(super.getIndex()+1);
//    }
    
    @Override
    public String toString(){
        return "Circle with O:("+getP()[0].getX()+","+getP()[0].getY()+"), radius= "+getRadius()+", area= "+area()+"m^2 and perimeter= "+perimeter()+"m.";
    }
    
    
//main==================================================================================================
    
}
