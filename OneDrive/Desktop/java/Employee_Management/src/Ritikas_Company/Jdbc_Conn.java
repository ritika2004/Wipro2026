package Ritikas_Company;

import java.sql.*;
public class Jdbc_Conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url="jdbc:mysql://localhost:3306/employee_db";
		String user="root";
		String password="rootroot";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		//create statement
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employee");
		System.out.println("Id\tName\t\tEmail\tSalary");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			int salary=rs.getInt("salary");
			System.out.println(id+"\t"+ name+"\t\t"+ email+"\t"+salary);
			//System.out.println("ID:"+id+"\tName:"+ name+"Salary:"+ salary);
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
