package Inheritance;

public class Dog extends Pet {

//variables=====================================================================


//constructors==================================================================
    public Dog(){}
    public Dog(String name, String breed, int age, char gender){
        super(name,breed,age,gender);
    }

//setters & getters=============================================================


//methods=======================================================================
    @Override
    public void sound(){
        System.out.println("Woof! ");
    }

//main==========================================================================

}//~class
