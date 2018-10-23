package SingletonLibrary;

public class Library {
    
//variables=====================================================================
    private static Book [] b;
    private static int c=0;
    private Librarian l;
    private static Library lib;
    
//constructor===================================================================    
    private Library(){
    this.l=null;
    b=new Book [1];
    
    }
    private Library (Librarian l){
        b=new Book [1];
        this.l=l;
    }
    
//setters & getters=============================================================
    public void setB(Book b[]){
        this.b=b;        
    }

    public Book[] getB() {
        return b;
    }

    public Librarian getL() {
        return l;
    }

    public void setL(Librarian l) {
        this.l = l;
    }
    
    
//methods=======================================================================
    public static Library getInstance(){
        if (lib==null){ lib= new Library();
        System.out.println("A new library has been created.");
        }else System.out.println("There is already a library. ");
        
        return lib;
    }
        
    public void addBook (Book b1){
    if (c==b.length){ 
        Book temp[]= new Book [2*b.length];
        for (int i=0;i<b.length;i++){
            temp[i]=b[i];
        }
        this.setB(temp);
        }    
    b[c]=b1;
    c++;
    }
    
    public void removeLastEntry () {
    if (c==0) {
        b[c]=null;
        System.out.println("The library is empty. ");        
    }
    else if(c==b.length/2){
        Book temp[]=new Book[b.length/2];
        for (int i=0;i<temp.length;i++){
            temp[i]=b[i];
        }
        this.setB(temp);
        b[c]=null;
        c--;
    } else{
        b[c]=null;
        c--;
        }
    }
    
//main========================================================================== 
    public static void main (String args[]){
        Librarian l=new Librarian("Mitsos");
        Author KP= new Author("Kwstis Palamas",'M');
        Author VS = new Author("Vas Sot", 'M');
        Book b1= new Book ("Memes Collection", KP, 20.0, 50);
        Book b2=new Book ("Whatever",VS, 15.5, 20);
        
        //Creation of library
        Library libs=lib.getInstance();
        libs.setL(l);
        System.out.println(l.searchBook("maimou", lib)); //test for search while library is empty
        libs.addBook(b1);
        libs.addBook(b2);
        
        Library libs2=lib.getInstance(); //test for 2nd Library object creation (Singleton pattern)
        
        //test customer book requests
        String req1="Memes Collection";
        String req2="POPAI";
        
        System.out.println(l.searchBook(req1, lib));
        System.out.println(l.searchBook(req2, lib));
        
    }
}
