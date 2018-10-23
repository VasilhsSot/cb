package shapes;

public class Main {
    
    
    public static void main (String args[]){
        Point p0=new Point(2,5);
        Point p1=new Point(1,10);
        Point p2=new Point(25,10);
        Point p3=new Point(25,1);
        Point p4=new Point(1,1);
        Point p5=new Point(1,6);
        Point p6=new Point(7,1);
        Rectangle r1=new Rectangle();
        
        Shape c1=new Circle(3.0);
        RightTriangle tr1 = new RightTriangle();
        
        r1.addP(p1);
        r1.addP(p2);
        r1.addP(p3);
        r1.addP(p4);   
        Rectangle r2=new Rectangle(r1);
        p1.setX(99);
//        c1.addP(p0);
        tr1.addP(p4);
        tr1.addP(p5);
        tr1.addP(p6);
        System.out.println(r1.toString()+"\n"+r2.toString()); //+"\n"+c1.toString()+"\n"+tr1.toString());
//        System.out.println("Vasi="+tr1.vasi()+" kai ypsos="+tr1.ypsos());
        r2.render();
        r1.render();
    }//~main
}//~class
