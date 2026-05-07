package Ritikas_Company;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
public class UpdateRecord {

    public static void updateEmployee(Scanner sc) {
    	try {Connection con = DBConnection.getConnection();

            
            while (true) {

                System.out.println("What do you want to update");
                System.out.println("1. Update Name");
                System.out.println("2. Update Salary");
                System.out.println("3. Update Email");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

               
                if (choice == 4) {
                    System.out.println("Program Exited Successfully");
                    break;
                }

          
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                String query = "";
                PreparedStatement ps;

                switch (choice) {

                    case 1:

                        System.out.print("Enter New Name: ");
                        String name = sc.nextLine();

                        query = "UPDATE employee SET name=? WHERE id=?";

                        ps = con.prepareStatement(query);

                        ps.setString(1, name);
                        ps.setInt(2, id);

                        int rows1 = ps.executeUpdate();

                        if (rows1 > 0) {
                            System.out.println("Name Updated Successfully");
                        } else {
                            System.out.println("Record Not Found");
                        }

                        break;

                    case 2:

                        System.out.print("Enter New Salary: ");
                        int salary = sc.nextInt();

                        query = "UPDATE employee SET salary=? WHERE id=?";

                        ps = con.prepareStatement(query);

                        ps.setInt(1, salary);
                        ps.setInt(2, id);

                        int rows2 = ps.executeUpdate();

                        if (rows2 > 0) {
                            System.out.println("Salary Updated Successfully");
                        } else {
                            System.out.println("Record Not Found");
                        }

                        break;

                    case 3:

                        System.out.print("Enter New Email: ");
                        String email = sc.nextLine();

                        query = "UPDATE employee SET email=? WHERE id=?";

                        ps = con.prepareStatement(query);

                        ps.setString(1, email);
                        ps.setInt(2, id);

                        int rows3 = ps.executeUpdate();

                        if (rows3 > 0) {
                            System.out.println("Email Updated Successfully");
                        } else {
                            System.out.println("Record Not Found");
                        }

                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

          
           

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}