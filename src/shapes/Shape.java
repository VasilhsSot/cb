package shapes;

public abstract class Shape {

//variables=====================================================================
    private Point[]p;
    private int index;
    private int capacity;
//constructors==================================================================
    public Shape(){}
    public Shape(int c){
        capacity=c;
        p=new Point[c];
        index=0;        
    }
    
    //copy constructor
    public Shape (Shape s){
        index=0;
        capacity=s.getP().length;
        p=new Point[capacity];
        for (int i=0;i<capacity;i++){
            p[i]=new Point(s.getP()[i].getX(),s.getP()[i].getY());
        }
    }

//setters & getters=============================================================

    public void setP(Point[] p) {
        this.p = p;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public Point[] getP() {
        return p;
    }

    public int getIndex() {
        return index;
    }

    public int getCapacity() {
        return capacity;
    }


//methods=======================================================================
    public abstract double perimeter();
    public abstract double area();
    
    
    
    public void addP(Point point){
        this.getP()[this.getIndex()]=point;
        this.setIndex(this.getIndex()+1);
    }
//main==========================================================================



}//~class
