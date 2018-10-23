package SingletonLibrary;

public class Author {

//variables=====================================================================
private String name;
private String email;
private char gender;

//constructors==================================================================
public Author (){}
public Author (String name, char gender){
    this.name=name;
    this.gender=gender;
    email="";
}
public Author(String name, String email, char gender){
    this.name=name;
    this.email=email;
    this.gender=gender;
}

//setters & getters=============================================================
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    

}
