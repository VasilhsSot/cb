package sQLexample;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {

//variables=====================================================================
Connection connection;
DriverManager dm;
Statement stm;

//constructors==================================================================
public Database(){}

//setters & getters=============================================================


//methods=======================================================================
public Connection connect(String _DB_URL, String _username, String _password) {
    try{
        connection= DriverManager.getConnection(_DB_URL, _username,_password);
        return connection;
    } catch (SQLException e){
        e.printStackTrace();
        return null;
    }
}

public int executeStatement (String sql) {
    try {
        stm=connection.createStatement();
        return stm.executeUpdate(sql);
    } catch (SQLException ex) {
        ex.printStackTrace();
        return -22;
    }
}

//main==========================================================================
public static void main (String args[]){
    Database db=new Database();
    String url="jdbc:mysql://localhost/";
    db.connect(url, "root", "Oldmanschild88");
    int k=db.executeStatement("create database telcatalog_2");
    System.out.println(k);
    
}
}//~class
