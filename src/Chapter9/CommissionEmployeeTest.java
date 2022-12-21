package Chapter9;

import java.util.Scanner;

public class CommissionEmployeeTest {
       static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         System.out.print("Enter employee first name: ");
         String firstname = input.nextLine();
        firstNameIsinValid(firstname);
        System.out.print("Enter employee last name: ");
         String lastname = input.nextLine();
        lastNameIsinValid(lastname);
        System.out.print("Enter employee ssn: ");
         String SSN = input.nextLine();
        ssnIsinValid(SSN);

        CommissionEmployee employee = new CommissionEmployee(firstname, lastname,
                 SSN, 10000, 0.06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("First name is %s", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%n%s %s%n", "Social Security number is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);

    }
    public static void firstNameIsinValid(String firstname) {
        boolean isInvalidFirstname = !ValidateInput.validateFirstName(firstname);
        if (isInvalidFirstname) {
            System.out.println("invalid firstname");
        }
    }
    public static void lastNameIsinValid(String lastname) {
        boolean isInvalidLastname = !ValidateInput.validateLastName(lastname);
        if (isInvalidLastname) {
            System.out.println("invalid lastname");
        }
    }
    public static void ssnIsinValid(String SSN) {
        boolean isInvalidSSN = !ValidateInput.validateSocialSecurity(SSN);
        if (isInvalidSSN) {
            System.out.println("invalid SSN");
        }
    }

//    public static void collectValidInput(String firstname, String lastname, String SSN){
//        while (true){
//            System.out.print("Enter employee first name: ");
//            firstname = input.nextLine();
//            if (firstname.equals(ValidateInput.validateFirstName(firstname)) );
//
//        }
//    }
}
