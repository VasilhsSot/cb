package AFDE;

public class test2 {
    public static void main (String args[]){
        String [] animals = {"cat","dog","pig","bear","bird","parrot","rabbit"};
        
        for (int i=0;i<animals.length;i++){
//         if (animals[i].charAt(0)=='p')continue;
//         or: if (animals[i].startsWith("p")) continue;
//         or:
           if (animals[i].substring(0,1).equals("p")) continue;
           System.out.println(i+": "+animals[i]);
        }
    }
}
