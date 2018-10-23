package shapes;

public class Point {
    private int x;
    private int y;
    
//constructors==================================================================
    Point(){    
//    System.out.println("A new Point object has been created with default values ("+this.x+","+this.y+") !");
    }
    
    Point(int x, int y){
        this.x=x;
        this.y=y;
//        System.out.println("A new Point object has been created with values ("+this.x+","+this.y+") !");
    }
    
    
//setter & getter===============================================================
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;              
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y) {
        this.y=y;
    }
    
    
//methods=======================================================================
    public void copy (Point b){
        this.setX(b.getX());
        this.setY(b.getY());
    }
}
