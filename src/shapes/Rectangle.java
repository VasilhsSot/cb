package shapes;

public class Rectangle extends Shape implements Renderable {

//variables=====================================================================
    
//constructors==================================================================
    public Rectangle (){
        super(4);
    }   
    
//setters & getters=============================================================
    
//methods=======================================================================
    public int sideA(){
        return Math.abs(getP()[1].getX()-getP()[0].getX());
    }
    
    public int sideB(){
        return Math.abs(getP()[1].getY()-getP()[2].getY());
    }
    
    @Override
    public double area(){
        return sideA()*sideB();
    }
    
    @Override
    public double perimeter(){
        return 2*sideB()+2*sideA();
    }
    
    @Override
    public void render(){
        String s="";
        for (int j=0;j<sideA();j++){
            if (j==sideA()-1){ s+=" *";}
            else {s+="  ";}
        }
        for(int i=0;i<=sideA();i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i=1;i<sideB()-1;i++){
            System.out.println("*"+s);
        }
        for (int i=0;i<=sideA();i++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
    
    @Override
    public String toString(){
        return("Rectangle with points A:("+getP()[0].getX()+","+getP()[0].getY()+"), B:("+getP()[1].getX()+","+getP()[1].getY()+"), C:("+getP()[2].getX()+","+getP()[2].getY()+"), D:("+getP()[3].getX()+","+getP()[3].getY()+"), has sideAB= "+sideA()+"m and sideBC= "+sideB()+"m. Its perimeter is "+perimeter()+"m. and its area is "+area()+"m^2 !");
        }
}
