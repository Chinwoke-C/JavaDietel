package Chapter10poly;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }
    public void validateWeeklySalary(double weeklySalary){
        boolean isInvalid = weeklySalary < 0.0;
        if (isInvalid) throw  new IllegalArgumentException("weekly salary must be >= 0.0");
    }

    public void setWeeklySalary(double weeklySalary) {
        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee details: %s%n%s: $%,.2f",super.toString(),"weekly salary", getWeeklySalary());

    }
}
