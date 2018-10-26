package AFDE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bunny implements Comparable {

//variables=====================================================================
    private int bunnyNumber;
    private String name;

//constructors==================================================================
    public Bunny(){}
    public Bunny(String name,int bunnyNumber){
        this.name=name;
        this.bunnyNumber=bunnyNumber;
    }

//setters & getters=============================================================

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//methods=======================================================================
    public void hop(){
        System.out.println("I'm a bunny "+this.getBunnyNumber());
    }
    
    @Override
    public int compareTo(Object t){
            int comparehop=((Bunny)t).getBunnyNumber();
            return this.bunnyNumber-comparehop;
        }
    @Override
    public boolean equals(Object o){
        if (o==this){return true;}
        if (o==null){return false;}
        if (getClass()!= o.getClass()) {return false;}
        Bunny b= (Bunny)o;
        return ((name==b.name || (name!=null && name.equals(b.name))) && (bunnyNumber==b.bunnyNumber));
    }
    
    

//main==========================================================================
    public static void main (String args[]){
        List<Bunny> bunnylist= new ArrayList<Bunny>();
        Map<String,Bunny> bunnymap=new TreeMap<String , Bunny>();
        Bunny b1=new Bunny("bugs",6);
        Bunny b2=new Bunny("rocky",19);
        Bunny b3=new Bunny("Ben",55);
        Bunny b4=new Bunny("rex",2);
        Bunny b5=new Bunny("aww",9);
        Bunny b6=new Bunny("aoi",88);
        Bunny b7= new Bunny("rer",99090909);
        Bunny b8= new Bunny("sdad",23);
        Bunny b9=new Bunny("ttyr",231);
        Bunny b10= new Bunny("66t===",13);
        Bunny b11=new Bunny("gasdasgr",3827);
        Bunny b12=new Bunny("sqfet",324);
        Bunny b13= new Bunny("dqdfzf",4554);
        Bunny b14= new Bunny("adqqrqrz",769);
        Bunny b15=new Bunny("asdqdartppp",31);
        bunnymap.put(b1.getName(),b1);
        bunnymap.put(b2.getName(), b2);
        bunnymap.put(b3.getName(), b3);
        bunnymap.put(b4.getName(), b4);
        bunnymap.put(b5.getName(), b5);
        bunnymap.put(b6.getName(), b6);
        bunnymap.put(b7.getName(), b7);
        bunnylist.add(b1);
        bunnylist.add(b2);
        bunnylist.add(b3);
        bunnylist.add(b4);
        bunnylist.add(b5);
        bunnylist.add(b6);
        bunnylist.add(b9);
        bunnylist.add(b7);
        bunnylist.add(b8);
        bunnylist.add(b10);
        bunnylist.add(b11);
        bunnylist.add(b12);
        bunnylist.add(b13);
        bunnylist.add(b14);
        bunnylist.add(b15);
        
        for (Bunny b: bunnylist){
            b.hop();
        }
        System.out.println("\n\n");
        for (int i=0;i<bunnylist.size();i++){
            bunnylist.get(i).hop();
        }
        
        
        Collections.sort(bunnylist);
        System.out.println("\n\n");
        Iterator<Bunny>itr1=bunnylist.iterator();
        Iterator<String>itr2=bunnymap.keySet().iterator();
        while (itr1.hasNext()){
            itr1.next().hop();
        }
        while(itr2.hasNext()){
            String name=itr2.next();
            int hop=bunnymap.get(name).getBunnyNumber();
            System.out.println(hop);
        }
    }


}//~class
