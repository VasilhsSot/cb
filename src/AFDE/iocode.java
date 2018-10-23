package AFDE;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class iocode {
static String name;
    
public static String getName (){
    return name;
}

public static void main (String args[])throws FileNotFoundException, IOException {
    PrintWriter writer;
    try {
    writer =new PrintWriter ("name.txt", "UTF-8");
    writer.println("The first Line");
    writer.println("The second line");
    writer.close();
}catch (UnsupportedEncodingException ex){
    Logger.getLogger(iocode.class.getName()).log(Level.SEVERE,null,ex);
}
    
    BufferedReader br = new BufferedReader (new FileReader ("name.txt") );
    String line;
    while ((line= br.readLine())!=null) {
        System.out.println(line);
    }
}
}
