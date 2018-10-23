package Inheritance;

public class Cat extends Pet {

//variables=====================================================================


//constructors==================================================================
    public Cat(){}
    
    public Cat(String name, String breed, int age, char gender){
        super(name,breed,age,gender);
    }

//setters & getters=============================================================


//methods=======================================================================
    @Override
    public void sound (){
        System.out.println("Meoow! ");
    }

//main==========================================================================

}//~class
