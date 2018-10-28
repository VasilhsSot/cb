package weeklyProject3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

//variables=====================================================================
    public static Scanner in=new Scanner(System.in);

//methods=======================================================================
    //for sorting by student's last name ascending.
    public static Comparator<Student> StudentLastNameCompAsc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   String StudentLastName1 = s1.getLastname().toUpperCase();
	   String StudentLastName2 = s2.getLastname().toUpperCase();
           return StudentLastName1.compareTo(StudentLastName2);
    }};
    //for sorting by student's last name descending.
    public static Comparator<Student> StudentLastNameCompDesc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   String StudentLastName1 = s1.getLastname().toUpperCase();
	   String StudentLastName2 = s2.getLastname().toUpperCase();
           return StudentLastName2.compareTo(StudentLastName1);
    }};
    
    //for sorting by student's age ascending.
    public static Comparator<Student> StudentAgeCompAsc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   int age1 = s1.getAge();
	   int age2 = s2.getAge();
	   return age1-age2;	   
   }};
    
    //for sorting by student's age descending.
    public static Comparator<Student> StudentAgeCompDesc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   int age1 = s1.getAge();
	   int age2 = s2.getAge();
	   return age2-age1;	   
   }};
    
    //for sorting by student's phone number ascending.
    public static Comparator<Student> StudentPhoneCompAsc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   int phone1 = s1.getPhone();
	   int phone2 = s2.getPhone();
	   return phone1-phone2;	   
   }};
    
    //for sorting by student's phone number descending.
    public static Comparator<Student> StudentPhoneCompDesc = new Comparator<Student>() {
        @Override
	public int compare(Student s1, Student s2) {
	   int phone1 = s1.getPhone();
	   int phone2 = s2.getPhone();
	   return phone2-phone1;	   
   }};
   
    public static int extractInt(String str) {
        Matcher matcher = Pattern.compile("\\d+").matcher(str);

        if (!matcher.find())
            throw new NumberFormatException("For input string [" + str + "]");

        return Integer.parseInt(matcher.group());
    }
    
    //opens the given file name and inserts it into the list.
    public static List<Student> openfile (String n) throws IOException{
        List<Student> list=new ArrayList<Student>();
        try{
            File f=new File(n);
            BufferedReader br = new BufferedReader (new FileReader (f));
            String line;
            String []t;
            while ((line= br.readLine())!=null) {
                if(!line.contains("First Name,Last Name")){
                    t=line.split(",");
                    Student obj= new Student(t[0],t[1],extractInt(t[2]),t[3],extractInt(t[4]),t[5],extractInt(t[6]));
                    list.add(obj);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            
        }
        return list;
    }
    
    //show the list.
    public static void showList(List<Student> list){
        Iterator<Student>itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());// using the toString() method.
        }
        System.out.print("\n");
    }
    
    //decides what kind of sort to do to the list.
    public static boolean switchSort(String s, List<Student> list){
        boolean b=true;
        switch (s) {
            case "1": Collections.sort(list, Main.StudentLastNameCompAsc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "2": Collections.sort(list, Main.StudentLastNameCompDesc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "3": Collections.sort(list, Main.StudentAgeCompAsc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "4": Collections.sort(list, Main.StudentAgeCompDesc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "5": Collections.sort(list, Main.StudentPhoneCompAsc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "6": Collections.sort(list, Main.StudentPhoneCompDesc);
                      System.out.println("Sort of the list completed.\n");
                      b=false;
                      break;
            case "7": b=false;
                      break;
            default : System.out.println("Invalid input. Please select 1-7. ");
                      break;
        }
        return b;
    }
    
    //decides what action the user has chosen.
    public static boolean switchCh (String ch, List<Student> list){
        boolean flag =true, b=true;
        switch (ch) {
            case "1":   showList(list);
                        break;
                      
            case "2":   while(b){                        
                            System.out.println("\nYou chose to sort the list. \nChoose 1-7 please.");
                            System.out.println("1. Sort by student's last name ascending. ");
                            System.out.println("2. Sort by student's last name descending. ");
                            System.out.println("3. Sort by student's age ascending. ");
                            System.out.println("4. Sort by student's age descending. ");
                            System.out.println("5. Sort by student's phone number ascending. ");
                            System.out.println("6. Sort by student's phone number descending. ");
                            System.out.println("7. Go back.");
                            String s=in.nextLine();
                            b=switchSort(s , list);
                        }
                        break;
            case "3":   System.out.println("Please give the name of the student to change his/her conduct. ");
                        String k=in.nextLine();
                        changeCon(k, list);                        
                        break;
            case "4":   flag=false;
                        break;
            default :   System.out.println("Invalid input. Please select 1-4");
                        break;
        }
        return flag;
    }
    
    //change the student's conduct.
    public static void changeCon(String n, List<Student> list){
        Iterator itr1=list.iterator();
        boolean found=false;
        for (Student s : list){
            if(s.getName().equals(n)) {
                found=true;
                System.out.println("Please give the new \"conduct\" for this student. ");
                String c= in.nextLine();
                s.setConduct(c);
            }
        }
        if (!found) System.out.println("Name "+n+" wasn't found in the list. ");
    }
    
    //shows the initial menu.
    public static void showMenu(){
        System.out.println("What action you want to do on the list? \n");
        System.out.println("1. Show student list. ");
        System.out.println("2. Sort the student list. ");
        System.out.println("3. Change the conduct of a student from the list. ");
        System.out.println("4. Exit.");
    }

//main==========================================================================
    public static void main (String args[]) throws IOException{
        boolean flag=true;
        
        //creating the list.
        List<Student> list1= new ArrayList<Student>();
        list1=openfile("Lab3_Names.txt");
        
        while (flag){
            showMenu();
            String ch=in.nextLine();
            flag=switchCh(ch,list1); //when false it ends the program.
        }
    }//~main
}//~class
