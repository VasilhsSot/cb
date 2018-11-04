package weeklyProject4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//variables=====================================================================
    public static List<Student>list1= new ArrayList<>();
    public static List<Worker>list2= new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static Database db=new Database();

//methods=======================================================================
    public static int extractInt(String str) {
        Matcher matcher = Pattern.compile("\\d+").matcher(str);

        if (!matcher.find())
            throw new NumberFormatException("For input string [" + str + "]");

        return Integer.parseInt(matcher.group());
    }
    
    public static void showMenu(){
        System.out.println("Choose one of the following: ");
        System.out.println("1. Show a student from the list. ");
        System.out.println("2. Show a worker from the list. ");
        System.out.println("3. Add a student to the list. ");
        System.out.println("4. Add a worker to the list. ");
        System.out.println("5. Exit. \n");                
    }
    
    public static void showStudent(String first_name, String last_name){
        boolean b=true;
        for(Student s: list1){
            if (s.getFirst_name().equals(first_name) && s.getLast_name().equals(last_name)){
                System.out.println("\n"+s);// using the toString() method. 
                b=false;
            }            
        }
        if (b){System.out.println("We couldn't find the student with the information you provided. \n");}
    }
    
    public static void showWorker(String first_name, String last_name){
        boolean b=true;
        for(Worker w: list2){
            if (w.getFirst_name().equals(first_name) && w.getLast_name().equals(last_name)){
                b=false;
                System.out.println("\n"+w);// using the toString() method.                
            }
        if(b) {System.out.println("We couldn't find the worker with the information you provided. \n");}
        }
    }
    
    public static List<Student> createStudentList() throws SQLException{
        List<Student> l1=new ArrayList<>();
        String q="select first_name,last_name,faculty_number from students;";
        try{
        db.stm=db.connection.createStatement();
        ResultSet rs=db.stm.executeQuery(q);
        while(rs.next()){
            Student b= new Student(rs.getString("first_name"),rs.getString("last_name"),rs.getString("faculty_number"));
            l1.add(b);
            }
        } catch (SQLException e){
            System.out.println("Problem with your query. ");
        }
     return l1;
    }
    
    public static List<Worker> createWorkerList() throws SQLException{
        List<Worker> l2=new ArrayList<>();        
        String q="select first_name,last_name,week_salary,work_hours from workers;";
        try{
        db.stm=db.connection.createStatement();
        ResultSet rs=db.stm.executeQuery(q);
        while(rs.next()){
            Worker b=new Worker(rs.getString("first_name"),rs.getString("last_name"),rs.getDouble("week_salary"),rs.getDouble("work_hours"));
            l2.add(b);
        }
        } catch (SQLException e){
            System.out.println("Problem with your query. ");
        }
     return l2;
    }
    
    public static void insertSt() throws SQLException{
        boolean bool1=false, bool2=false, bool3=false;
        String n="",la="",fa="";
        while (!bool1){
            System.out.println("Give the name of the student please (At least 3 letters and start with capital). ");
            n=sc.nextLine();
            if(n.length()>2){ //checking the length of name >2.
                if (Character.isUpperCase(n.charAt(0))) { //checking if the first letter is capital.
                    bool1=true;
                } else { System.out.println("The name should start with capital letter. ");}
            } else {System.out.println("Name has to be more than 2 characters. ");}        
        }
        while(!bool2){
            System.out.println("Give the last name of the student please (At least 4 letters and start with capital). ");
            la=sc.nextLine();
            if (la.length()>3){ //checking the length of last name >3
                if (Character.isUpperCase(la.charAt(0))) {  //checking if the first letter is capital.
                bool2=true;
                } else {System.out.println("Last name should start with capital letter. ");}                
            }else {System.out.println("Last name has to be more than 3 characters. ");}
        }
        while(!bool3){
            System.out.println("Give the faculty number of the student (5-10 digits or letters). ");
            fa=sc.nextLine();
            if (fa.length()<11 || fa.length()>4) {
                bool3=true;
            } else {System.out.println("Faculty number length should be 5-10 digits or letters. ");}
        }
        String q= "INSERT INTO students (id,first_name,last_name,faculty_number) values (null,'"+n+"','"+la+"','"+fa+"');";
        db.executeStatement(q);
        list1=createStudentList(); //update list
        System.out.println("Student has been inserted successfully. \n");
    }
    
    public static void insertWo() throws SQLException{
        boolean bool1=false, bool2=false, bool3=false, bool4=false;
        String n="",la="",wss="",whs="";
        double ws=0.0,wh=0.0;
        while (!bool1){
            System.out.println("Give the name of the worker please (At least 3 letters and start with capital). ");
            n=sc.nextLine();
            if(n.length()>2){ //checking the length of name >2.
                if (Character.isUpperCase(n.charAt(0))) { //checking if the first letter is capital.
                    bool1=true;
                } else { System.out.println("The name should start with capital letter. ");}
            } else {System.out.println("Name has to be more than 2 characters. ");}        
        }
        while(!bool2){
            System.out.println("Give the last name of the worker please (At least 4 letters and start with capital). ");
            la=sc.nextLine();
            if (la.length()>3){ //checking the length of last name >3
                if (Character.isUpperCase(la.charAt(0))) {  //checking if the first letter is capital.
                bool2=true;
                } else {System.out.println("Last name should start with capital letter. ");}                
            }else {System.out.println("Last name has to be more than 3 characters. ");}
        }
        while(!bool3){
            System.out.println("Give the weekly salary of the worker (more than 10.0). ");
            wss=sc.nextLine();
            ws=Double.parseDouble(wss);
            if (ws>10.0) {
                bool3=true;
            } else {System.out.println("Weekly salary should be more than 10.0 . ");}
        }
        while(!bool4){
            System.out.println("Give the working hours per day of the worker (1-12). ");
            whs=sc.nextLine();
            wh=Double.parseDouble(whs);
            if (wh>=1.0 && wh<=12.0) {
                bool4=true;
            } else {System.out.println("Working hours per day should be 1-12. ");}
        }
        String qu= "INSERT INTO workers (id,first_name,last_name,week_salary,work_hours) values (null,'"+n+"','"+la+"',"+ws+","+wh+");";
        db.executeStatement(qu);        
        list2=createWorkerList(); //update list
        System.out.println("Worker has been inserted successfully. \n");
    }
    
    public static boolean switchCh (String ch) throws SQLException{
        boolean flag =true, b=true;
        String sn,sl,wn,wl;
        switch (ch) {
            case "1":   System.out.println("Please give the first name of the student you are looking for.. ");
                        sn=sc.nextLine();
                        System.out.println("Pease give the last name of the student you are looking for.. ");
                        sl=sc.nextLine();
                        showStudent(sn,sl);
                        break;
                      
            case "2":   System.out.println("Please give the first name of the worker you are looking for.. ");
                        wn=sc.nextLine();
                        System.out.println("Pease give the last name of the worker you are looking for.. ");
                        wl=sc.nextLine();
                        showWorker(wn,wl);
                        break;
            case "3":   insertSt();                        
                        break;
            case "4":   insertWo();
                        break;
            case "5":   flag=false;
                        break;
            default :   System.out.println("Invalid input. Please select 1-5");
                        break;
        }
        return flag;
    }
    
//main==========================================================================
    public static void main (String args[]) throws SQLException{
        String url= "jdbc:mysql://127.0.0.1:3306/humanity";
        db.connect(url,"admin","admin");
        list1=createStudentList();
        list2=createWorkerList();
        boolean flag=true;
        String ch="";
        while(flag){
            showMenu();
            ch=sc.nextLine();
            flag=switchCh(ch);
        }
        sc.close();
        db.connection.close();
    }//~main
}//~class