package Ritikas_Company;

import java.sql.Connection;

import java.sql.*;


import java.util.*;

public class CreateNewEmployee {

	public static void addEmployee(Scanner sc) {
		 try (Connection con = DBConnection.getConnection()) {
	            System.out.print("Enter Employee ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();
	            
	            System.out.print("Enter Employee Name: ");
	            String name = sc.nextLine();
	            
	            System.out.print("Enter Employee Email ");
	            String email = sc.nextLine();
	            
	            System.out.print("Employee Salary");
	            int salary = sc.nextInt();

	            String sql = "INSERT INTO Employee (id,name, email,salary) VALUES (?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, id);
	            ps.setString(2,name);
	            ps.setString(3, email);
	            ps.setInt(4, salary);

	            ps.executeUpdate();
	            System.out.println("Record Created");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
