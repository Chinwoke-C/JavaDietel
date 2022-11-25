package Chapter9;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "lewis",
                "333-33-3333",
                5000, .04,300);
        System.out.println("Base Salary Employee Details");
        System.out.printf("First name is: %s%n",employee.getFirstName());
        System.out.printf("Last name is: %s%n",employee.getLastName());
        System.out.printf("SSN is: %s%n",employee.getSocialSecurityNumber());

    }
}
