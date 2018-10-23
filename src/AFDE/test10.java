package AFDE;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class test10 {
public static void main(String args[]) throws FileNotFoundException{
    String name, surname, color;
    int age;
    System.out.println("What's your first name? ");
    Scanner s = new Scanner(System.in);
    name=s.nextLine();
    System.out.println("What's your surname?");
    surname=s.nextLine();
    System.out.println("What's your favorite color?");
    color=s.nextLine();
    System.out.println("What's your age?");
    age=s.nextInt();
    
    s.close();
    
    PrintWriter writer;
    try {
    writer =new PrintWriter ("name.txt", "UTF-8");
    writer.println("Name: "+name);
    writer.println("Surname: "+surname);
    writer.println("Age: "+age);
    writer.println("Favorite color: "+color);
    writer.close();
}catch (UnsupportedEncodingException ex){}
}
}
