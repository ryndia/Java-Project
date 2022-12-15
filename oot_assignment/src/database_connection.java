import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Result;  
public class database_connection {
	
	Statement stmt;
	Connection con;
	ResultSet rs;
	
	public ArrayList<ArrayList<String>> connect(String query){ 
		ArrayList<ArrayList<String>> attendancesystemR = new ArrayList<ArrayList<String>>(); 
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_system","root","");
			//query
			stmt=con.createStatement();  
			rs=stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData(); 
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) {              
			   int i = 1;
			   ArrayList<String> temp = new ArrayList<String>();
			   while(i <= columnCount) {
				
			        temp.add(rs.getString(i++));
			        
			   }
			   attendancesystemR.add(temp);
			}		
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
			
		return attendancesystemR;  
	}
	
	public int insQuery(String query)
	{
		int count = 0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_system","root","");
			//query
			stmt=con.createStatement();  
			count = stmt.executeUpdate(query);	
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
			
		return count;
	}
}
