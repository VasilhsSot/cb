package weeklyProject4;

public class Student extends Human {
//variables=====================================================================
    private String faculty;

//constructors==================================================================
    public Student(){
        faculty="00000";
    }
    public Student(String first_name, String last_name,String faculty){
        super(first_name, last_name);
        this.faculty=faculty;
    }

//setters & getters=============================================================
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getFaculty() {
        return faculty;
    }


//methods=======================================================================
    @Override
    public String toString(){
        return "First Name: "+super.getFirst_name()+"\nLast Name: "+super.getLast_name()+"\nFaculty Number: "+this.getFaculty();
    }

//main==========================================================================



}//~class
