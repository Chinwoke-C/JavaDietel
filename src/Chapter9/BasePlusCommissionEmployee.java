package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    validateBaseSalary(baseSalary);
    }
    public void validateBaseSalary(double baseSalary ){
        boolean isInvalid = baseSalary < 0.0;
        if (isInvalid) throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
    public  void setBaseSalary(double baseSalary){
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s%n%s %.2f",
                "base-salaried commission employee",super.toString(),"base salary", getBaseSalary());}



    }


