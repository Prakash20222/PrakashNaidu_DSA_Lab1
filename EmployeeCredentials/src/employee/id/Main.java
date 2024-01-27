package employee.id;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. HumanResource");
        System.out.println("4. Legal");

        
        String department = "";
        int departmentChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (departmentChoice) {
            case 1:
                department = "Technical";
                break;
            case 2:
                department = "Admin";
                break;
            case 3:
                department = "HumanResource";
                break;
            case 4:
                department = "Legal";
                break;
            default:
                department = "Unknown";
                break;
        }

        System.out.println("Enter the first name:");
        String firstName = scanner.next();

        System.out.println("Enter the last name:");
        String lastName = scanner.next();

        Employee employee = new Employee(firstName, lastName);
        employee.setDepartment(department);

        String password = CredentialService.generatePassword();
        CredentialService.showCredentials(employee, password);

        scanner.close(); 
    }
}
