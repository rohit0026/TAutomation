package IMDB.Movies;


import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gherkin.deps.com.google.gson.Gson;

public class databaseTest {
	
	@Test
	public void Database() throws SQLException, ClassNotFoundException, StreamWriteException, DatabindException, IOException  
	{
		String host = "localhost";
		String Port = "3306";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + Port + "/sakila", "root", "Gv93tkb");
		Statement s  = con.createStatement();
		ResultSet rs=s.executeQuery("select * from abc where Salary <2500;;");
		
		
		ArrayList<CustomerDetails> AL = new ArrayList<CustomerDetails>();
		
		while (rs.next()) {
			
			CustomerDetails cd = new CustomerDetails();//when this was out of this every time last
			//row was getting printed in console as well as in json
			cd.setID(rs.getInt(1));
			cd.setSalary(rs.getString(2));
			cd.setName(rs.getString(3));
			AL.add(cd);
			
//			System.out.println(cd.getID());
//			System.out.println(cd.getSalary());
//			System.out.println(cd.getName());
			
			
			
		}
		for(int i=0;i<AL.size();i++)
		{
			System.out.println(AL.get(i));
			ObjectMapper ob = new ObjectMapper();
			ob.writeValue(new File("C:\\Users\\Rohit\\Cloned\\TAutomation\\customer"+i+".json"), AL.get(i));
			com.google.gson.Gson g = new com.google.gson.Gson();
			g.toJson(null);
			File f = new File("C:\\Users\\Rohit\\Cloned\\TAutomation\\customer"+i+".json");
			if(f.delete())
			{
			  System.out.println(f.getName() + " deleted");   //getting and printing the file name   
			}
			
		}
		
		con.close();
		
	
		
		
	}

}
