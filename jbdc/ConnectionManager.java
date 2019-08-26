package com.collabera.jbdc;


import java.sql.*;
import java.util.*;

public class ConnectionManager {
static final String URL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=EST5EDT";

static final String USERNAME = "root";
static final String PASSWORD = "Escape12";

public static Connection getConnention() {
	Connection conn = null;
	try {
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Connection was made!");
		
		//Statement stmt = conn.createStatement(Ruleset.TYPE_SCROLL_INSENTIVE)
		
		
		
		//boolean flag = mystatement.execute("select * from Jump_people");
		//if(flag == false) {
			//System.out.println("Here are the rows" + );
		//}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return conn;
	
}


public static void main(String[] args) throws SQLException {
	
	Connection conn = ConnectionManager.getConnention();
	
		// hello we did some stuff 

	/*try {
	Statement mystatement = conn.createStatement();
	
	String query = "SELECT * FROM actor";
	
	ResultSet rs = mystatement.executeQuery(query);
	
	rs.absolute(195);
	
	String firstname = rs.getString("first_name");
	
	String actorID = rs.getString(1);
	
	System.out.println("ID: " + actorID + " Name: " + firstname);
	
	while(rs.next()) {
		
		
		firstname = rs.getString("first_name");
		actorID = rs.getString(1);
		System.out.println("ID: " + actorID + " Name: " + firstname);
		
		
		
		
	}
	
	
	
	}
	
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Type in city name ");
	
	String name = sc.nextLine();
	
	String query = String.format("SLECT * FROM city WHERE name = 's%'" , name);
	
	//String query = String.format("SLECT * FROM city WHERE name = ''" , name);
	
	ResultSet rs = mystatement.executeQuery(query);
	
	System.out.println(query); 
	

	
	try {
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM actor";
		ResultSet rs = statement.executeQuery(sql);
		rs.absolute(195);
		String firstname = rs.get;
	}
	
	catch(SQLException e){
		
		e.printStackTrace();
		
	}*/
	
	
	
	
	
	
	try {
		conn.close();
		System.out.println("Connection was closed");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
