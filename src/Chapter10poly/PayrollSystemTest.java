package Chapter10poly;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("john","smith",
                        "111-11-1111",800.00);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("karen", "price",
                "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "jones", "333-33-3333",
                10000, .06);

        BonusCommissionEmployee bonusCommissionEmployee = new BonusCommissionEmployee("" +
                "Bob", "lewis", "444-44-4444", 5000,
                .04, 300);

//        System.out.println("Employees processed individually:");
//
//        System.out.printf("%n%s%n%s: $%,.2f%n%n",
//                salariedEmployee,"earned",salariedEmployee.earnings());
//
//        System.out.printf("%s%n%s: $%,.2f%n%n",
//                hourlyEmployee, "earned", hourlyEmployee.earnings());
//
//        System.out.printf("%s%n%s: $%,.2f%n%n",
//                bonusCommissionEmployee, "earned", bonusCommissionEmployee.earnings());
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, bonusCommissionEmployee};
        System.out.printf("Employees processed polymorphically:%n%n");
        for (Employee currentEmployee : employees ) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BonusCommissionEmployee){
                BonusCommissionEmployee employee = (BonusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary()
                );
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());

        }
        for (int i = 0; i <employees.length ; i++) {
            System.out.printf("Employee %d is a %s%n", i,
                    employees[i].getClass().getName());

        }

    }
}
