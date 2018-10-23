package Inheritance;

public class Main {

//variables=====================================================================
 private static Phone []p;
 private int index;
 private int capacity;
 

//constructors==================================================================
    public Main(){
        index=0;
    }
    public Main(int c){
        capacity=c;
        p=new Phone[capacity];
        index=0;
    }

//setters & getters=============================================================

    public static Phone[] getP() {
        return p;
    }

    public int getIndex() {
        return index;
    }

    public int getCapacity() {
        return capacity;
    }

    public static void setP(Phone[] p) {
        Main.p = p;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    


//methods=======================================================================
    public void add(Phone d){
        p[index]=d;
        index++;
    }
    
    public void showT(){
        for (int i=0;i<index;i++){
            System.out.println((i+1)+": "+p[i].getBrand()+" - "+p[i].getPrice());
        }
    }

//main==========================================================================
    public static void main (String args[]){
       Phone a,b,c,d,e,f,g,h,i,j;
       a=new Android("Samsung S9");
       b=new Android("Xiaomi Redmi Note 4");
       c= new Android("Sony Xperia");
       d= new Android("Motorola Moto G 2nd gen");
       e=new NonAndroid("Iphone 5s");
       f=new NonAndroid("Iphone 9");
       g=new Android("One Plus Two");
       h= new NonAndroid("Nokia 3210");
       i=new NonAndroid("Iphone X");
       j= new NonAndroid("Iphone 8");
       
       Main k= new Main(10);
       
       k.add(a);
       k.add(b);
       k.add(c);
       k.add(d);
       k.add(e);
       k.add(f);
       k.add(g);
       k.add(h);
       k.add(i);
       k.add(j);
       k.showT();
       
       
    }
}//~class
