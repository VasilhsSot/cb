package AFDE;
//dimiourgeitai ena antikeimeno. OXI 3.
public class MyClass {
    MyClass(){
        this(5);
        System.out.println("The default constructor. ");
    }
    MyClass(int x){
        this(5,15);
        System.out.println(x);
    }
    MyClass(int x, int y){
        System.out.println(x*y);
    }

public static void main (String args[]){
    new MyClass();
}
}

