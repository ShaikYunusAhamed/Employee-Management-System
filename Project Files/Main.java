import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();
        int choice;

        do {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(name, dept, salary));
                    break;

                case 2:
                    List<Employee> employees = dao.getAllEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("⚠️ No employees found.");
                    } else {
                        employees.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int idToUpdate = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    dao.updateSalary(idToUpdate, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int idToDelete = sc.nextInt();
                    dao.deleteEmployee(idToDelete);
                    break;

                case 5:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
