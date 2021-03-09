package IMDB.Movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class databaseTest {
	
	@Test
	public void Database() throws SQLException  
	{
		String host = "localhost";
		String Port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + Port + "/sakila", "root", "Gv93tkb");
		Statement s  = con.createStatement();
		ResultSet rs =    s.executeQuery("select * from abc;");
		rs.next();
		System.out.println(rs.getString("salary"));
		System.out.println(rs.getString("name"));
		
	}

}
