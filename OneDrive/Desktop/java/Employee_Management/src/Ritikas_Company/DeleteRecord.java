package Ritikas_Company;
import java.sql.*;

import java.util.*;
public class DeleteRecord {
	public static void deleteEmployee(Scanner sc) {
        try {
        	
            Connection con = DBConnection.getConnection();
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();
            
            String query = "DELETE FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Employee Deleted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	

}
