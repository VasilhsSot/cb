package SingletonLibrary;

public class Book {

//variables=====================================================================
    private String name;
    private Author au;
    private double price;
    private int qty;

//constructors==================================================================
    public Book(){}

    public Book(String name, Author au){
    this.name=name;
    this.au=au;
    price=0.0;
    qty=0;
}

    public Book(String name, Author au, double price){
    this.name=name;
    this.au=au;
    this.price=price;
    qty=0;    
}

    public Book(String name, Author au, double price, int qty){
    this.name=name;
    this.au=au;
    this.price=price;
    this.qty=qty;
}

    

//setter & getters==============================================================
    public void setName(String name) {
        this.name = name;
    }

    public void setAu(Author au) {
        this.au = au;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAu() {
        return au;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

//methods=======================================================================
       
    public String getAuthorName(){
        return this.getAu().getName();
    }
    
    public String getAuthorEmail (){
        return this.getAu().getEmail();
    }
    
    public char getAuthorGender(){
        return this.getAu().getGender();
    }
    
    @Override
    public String toString(){
        return ("Book[name=\""+this.name+"\",Author[name="+this.getAuthorName()+",email="+this.getAuthorEmail()+",gender="+this.getAuthorGender()+"], price="+this.getPrice()+", qty="+this.getQty()+".");
    }

}
