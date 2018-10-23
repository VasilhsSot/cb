package SortdArray;

public class SortedArray {

//variables=====================================================================
    private int capacity; //length
    private int []n;
    private int index; //current array position 
	
//constructor===================================================================
    public SortedArray(){}
    
    public SortedArray (int capacity){
        this.capacity=capacity;
        n= new int[capacity];
        index=0;
    }
    
//setters & getters=============================================================
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setN(int[] n) {
        this.n = n;
    } 
    
    public int getCapacity() {
        return capacity;
    }

    public int[] getN() {
        return n;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
//methods=======================================================================
    public int findInt(int k){
        int ind=0;
        for (int i=0;i<n.length;i++) {
            if (n[i]==k) {
                ind=i;
                break;
            }
        }
        return ind;
    }
    
    public boolean containsEle(int k){
        boolean flag=false;
        for (int i=0;i<n.length;i++){
            if (n[i]==k){
                flag=true;
                break;
            }
        }
        return flag;
    }
    
    public void sortArray(){
        int temp=0;
        for (int i=1;i<n.length;i++){
            for (int j=0;j<(n.length-i);j++){
                if (n[j]<n[j+1]){
                    temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;
                }
            }
        }
    }
    
    public void insert(int k){
        if((index+1)==n.length) {
            int [] temp = new int [n.length*2];
            for (int i=0;i<n.length;i++){
                temp[i]=n[i];
            }
            this.setN(temp);
            this.setCapacity(n.length*2);
        }
        n[index]=k;
        index++;
        this.sortArray();
    } //insert using sort
    
    public void insertEle (int k){ 
        int l=0;
        int t=0;
        if(index==n.length) {
            int [] temp = new int [capacity*2];
            for (int i=1;i<n.length;i++){
                temp[i]=n[i];
            }
            this.setN(temp);
            this.setCapacity(capacity*2);
        }
        if (k<this.min()) {n[index++]=k;}
        else{ 
            for (int i=0;i<n.length;i++){
                if (n[i]==0 || k>n[i]) {
                    l=i;
                    break;
                }                
            }
            t=n[l];
            n[l]=k;
            for (int j=n.length-1;j>l;j--){
                n[j]=n[j-1];
                if (j==l+1){n[j]=t;}
            }
            index++;
        }
    }//insert without using sort
    
    public boolean delete (int k){
        if (!this.containsEle(k)){
//            System.out.println("The array doesn't contain the number "+k+" !");
            return false;
        }else {
            n[this.findInt(k)]=0;
            index--;
            this.sortArray();
            return true;
        }        
    }//delete using sort
    
    public boolean deleteEle (int k){
        boolean flag = true;
        int l=0;
        int temp=0;
        if (!this.containsEle(k)){return false;}
        
        for (int i=0;i<n.length;i++){
            if (n[i]==k){
                n[i]=0;
                l=i;
                break;
            }
        }
        if (index!=0) {
            for (int j=l;j<n.length-1;j++){
                temp=n[j];
                n[j]=n[j+1];
                n[j+1]=temp;
            }
            index--;}
        return flag;
    } //delete without using sort
    
    public int get(int k){
        return n[k];
    }
    
    public int getSize(){
        return index;
    }
    
    public int min(){
        return n[index-1];        
    }
    
    public int max(){
        return n[0];
    }
    
    public boolean equals(SortedArray s){
        if (s==this){
            return true;
        }else if(this.getClass()!=s.getClass()){
            return false;
        }
        if (this.capacity!=s.capacity){
            return false;
        }else if (this.getSize()!=s.getSize()){
                return false;
        }else{
            for (int i=0;i<n.length;i++){
                if (n[i]!=s.getN()[i]){
                    return false;
                }
            }
        }
        return true;        
    }

//main==========================================================================    
public static void main (String args[]){
    SortedArray a = new SortedArray(1);
    SortedArray b = new SortedArray(1); //same as a
    SortedArray c = new SortedArray(1);//same capacity, different elements
    SortedArray d = new SortedArray(20);//different capacity
        
    a.insert(5);
    a.insert(9);
    
    b.insert(5);
    b.insert(9);
    
    c.insert(6);
    c.insert(14);
    
    d.insert(5);
    d.insert(9);
    System.out.println("a size is "+a.getSize()+", a min element is "+a.min()+" and a capacity is "+a.getCapacity());
    System.out.println("a equals b is "+a.equals(b)); //true
    System.out.println("a equals c is "+a.equals(c)); //false
    System.out.println("a equals d is "+a.equals(d)); //false
	
	//insert and delete tests on object a
    System.out.println("\nARXIKA");
    for (int i=0;i<a.getN().length;i++){
        System.out.println(a.getN()[i]);
    }
	
    System.out.println("\n(deleteEle(5)");
    a.deleteEle(5); 
    for (int i=0;i<a.getN().length;i++){
        System.out.println(a.getN()[i]);
    }
    System.out.println("\n(insert(3))");
    a.insertEle(3);
    for (int i=0;i<a.getN().length;i++){
        System.out.println(a.getN()[i]);
    }
    
	System.out.println("\n(Insert(6))");
	a.insertEle(6);
    for (int i=0;i<a.getN().length;i++){
        System.out.println(a.getN()[i]);
    }
	
	System.out.println("\n(deleteEle(9))");
    a.deleteEle(9);
    for (int i=0;i<a.getN().length;i++){
        System.out.println(a.getN()[i]);
    }
    
} //~main
} //~class
