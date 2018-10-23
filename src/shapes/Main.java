package shapes;

public class Main {
    
    
    public static void main (String args[]){
        Point p0=new Point(2,5);
        Point p1=new Point(1,4);
        Point p2=new Point(6,4);
        Point p3=new Point(6,1);
        Point p4=new Point(1,1);
        Point p5=new Point(1,6);
        Point p6=new Point(7,1);
        Shape r1=new Rectangle();
        Shape c1=new Circle(3.0);
        RightTriangle tr1 = new RightTriangle();
        
        r1.addP(p1);
        r1.addP(p2);
        r1.addP(p3);
        r1.addP(p4);        
        c1.addP(p0);
        tr1.addP(p4);
        tr1.addP(p5);
        tr1.addP(p6);
        System.out.println(r1.toString()+"\n"+c1.toString()+"\n"+tr1.toString());
        System.out.println("Vasi="+tr1.vasi()+" kai ypsos="+tr1.ypsos());
    }//~main
}//~class
