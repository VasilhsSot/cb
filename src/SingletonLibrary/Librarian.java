package SingletonLibrary;

public class Librarian {
//variables=====================================================================
    private String name;
    
//constructors==================================================================
    public Librarian (){}
    
    public Librarian (String name){
        this.name=name;
    }
//getters & setters=============================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//methods=======================================================================
    public String returnReq (Book b) {
        return "Author: "+b.getAuthorName()+" and book availability: "+b.getQty();
}

    public String searchBook(String name, Library lib) {
        String is="The Library doesn't have the book \""+name+"\" available.";
        for (int i=0;i<lib.getB().length;i++) {
            if (lib.getB().length==1 && lib.getB()[0]==null){
                return "The library is empty. ";    
            }
            if (lib.getB()[i]!=null){
                if(lib.getB()[i].getName().equals(name)) {
                    return "We have the book \""+name+"\", its quantity is: "+lib.getB()[i].getQty()+" and it costs: "+lib.getB()[i].getPrice()+" euros";
                }
            }else break;
        }
        return is;
    }
}
