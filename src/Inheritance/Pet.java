package Inheritance;

public abstract class Pet {

//variables=====================================================================
    private String name;
    private String breed;
    private int age;
    private char gender;

//constructors==================================================================
    public Pet(){}
    
    public Pet (String name, String breed, int age, char gender){
    this.name=name;
    this.breed=breed;
    this.age=age;
    this.gender=gender;
}

//setters & getters=============================================================
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//methods=======================================================================
    public abstract void sound();

//main==========================================================================
}//~class
