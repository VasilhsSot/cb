package sQLexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Helper {

//variables=====================================================================
public static final String HOST = "localhost";
public static final String PORT = "3306";
public static final String DRIVER = "jdbc:mysql://";
public static final String DB = "sales";
public static final String USER = "root";
public static final String PASSWORD = "Oldmanschild88";

//constructors==================================================================


//setters & getters=============================================================


//methods=======================================================================
public static Connection getDBConnection() throws SQLException {
    Connection con = DriverManager.getConnection(DRIVER+HOST+":"+PORT+"/"+DB,USER,PASSWORD);
    return con;
}

public static void closeDBConnection (Connection con) throws SQLException {
    con.close();
}
//main==========================================================================
public static void main (String args[]) throws SQLException{
    Statement stmt=null;
    String query= "select customers.cname as Name, count(sales.ccode) as total_purchases from customers left join sales on sales.Ccode = customers.Ccode group by customers.cname order by count(sales.ccode) desc";
    Connection con = getDBConnection();
    try {
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String customers = rs.getString("Name");
            int count = rs.getInt("total_purchases");
            System.out.printf("%-20s  %-2s \n",customers , count);
        }
    } catch (SQLException e ) {
        e.printStackTrace();
    } finally {
        if (stmt != null) { stmt.close(); }
    }
}//~main
}//~class
