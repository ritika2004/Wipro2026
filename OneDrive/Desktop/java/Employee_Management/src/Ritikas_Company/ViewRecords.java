package Ritikas_Company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class ViewRecords {
	public static void viewrecord() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Id\tName\tEmail\t\tSalary");
            while (rs.next()) {
            	
            	int id=rs.getInt("id");
				String name=rs.getString("name");
			
				String email=rs.getString("email");
				int salary=rs.getInt("salary");
				System.out.println(id+"\t"+ name+"\t"+ email+"\t\t"+ salary);

         
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	

}
