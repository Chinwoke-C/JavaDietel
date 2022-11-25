package Chapter10poly;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        validateHourlyEmployee(wage, hours);
        this.wage = wage;
        this.hours = hours;
    }
    public void validateWage(double wage){
        boolean isInvalid = wage < 0.0;
        if (isInvalid) throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    }
    public void validateHour(double hours){
        boolean isInvalid = (hours < 0.0) || (hours > 168.0);
    }

    public void setWage(double wage) {
        validateWage(wage);
        this.wage = wage;
    }

    public void setHours(double hours) {
        validateHour(hours);
        this.hours = hours;
    }
    public void validateHourlyEmployee(double wage, double hours ){
        validateWage(wage);
        validateHour(hours);
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        }
        return 40 * getWage() + (getHours() - 40)* getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }

}
