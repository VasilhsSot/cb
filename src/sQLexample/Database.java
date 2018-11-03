package sQLexample;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


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
    String url="jdbc:mysql://localhost:3306/telcatalog_2";
    db.connect(url, "root", "Oldmanschild88");
    int k=db.executeStatement("CREATE TABLE `contacts` (\n" +
"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
"  `first_name` varchar(50) NOT NULL,\n" +
"  `last_name` varchar(50) NOT NULL,\n" +
"  `twitter` varchar(30) DEFAULT NULL,\n" +
"  `facebook` varchar(30) DEFAULT NULL,\n" +
"  `instagram` varchar(30) DEFAULT NULL,\n" +
"  PRIMARY KEY (`id`),\n" +
"  KEY `con_fname_idx` (`first_name`)\n" +
") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1");
    System.out.println(k);
    
}
}//~class
