package weeklyProject3;

public class Student {

//variables=====================================================================
    String name;
    String lastname;
    int age;
    String height;
    int tuition;
    String date;
    int phone;
    String conduct;

//constructors==================================================================
    public Student(){}
    
    public Student (String name,String lastname,int age, String height, int tuition, String date, int phone) {
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.height=height;
        this.tuition= tuition;
        this.date=date;
        this.phone=phone;
        conduct="good";
    }


//setters & getters=============================================================
    public void setConduct(String conduct) {
        this.conduct = conduct;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public int getTuition() {
        return tuition;
    }

    public String getDate() {
        return date;
    }

    public int getPhone() {
        return phone;
    }

    public String getConduct() {
        return conduct;
    }

//methods=======================================================================
    @Override
    public String toString(){
        return (getName()+" , "+getLastname()+" , "+getAge()+" , "+getHeight()+" , "+getTuition()+" , "+getDate()+" , "+getPhone()+" , "+getConduct());
    }
        
//main==========================================================================
}//~class
