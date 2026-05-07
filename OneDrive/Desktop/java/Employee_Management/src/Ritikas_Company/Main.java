package Ritikas_Company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("👤 Username: ");
        String username = sc.nextLine();
        System.out.print("🔒 Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("❌ Login failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n Employee Management System");
            System.out.println("1. Create new Record of Employee");
            System.out.println("2. View Records");
            System.out.println("3. Update Employee Information");
            System.out.println("4. Delete Employee Record");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> CreateNewEmployee.addEmployee(sc);
                case 2 -> ViewRecords.viewrecord();
                case 3 -> UpdateRecord.updateEmployee(sc);
                case 4 -> DeleteRecord.deleteEmployee(sc);
                case 5 -> {
                    System.out.println("🔚 Goodbye!");
                    return;
                }
                default -> System.out.println("❓ Invalid option");
            }
        }


	}

}
