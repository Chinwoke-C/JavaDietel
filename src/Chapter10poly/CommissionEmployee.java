package Chapter10poly;
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        validateEmployee(grossSales, commissionRate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public void validateGrossSales(double grossSales) {
        boolean isInvalid = grossSales < 0.0;
        if (isInvalid) throw new IllegalArgumentException("Gross sales must be above 0.0");


    }
    public void validateCommissionRate(double commissionRate){
        boolean isInvalid = commissionRate <= 0.0 || commissionRate >= 1.0;
        if (isInvalid) throw new IllegalArgumentException("commission rate must be above 0.0 and below 1.0");

    }
    public void validateEmployee(double grossSales, double commissionRate){
        validateGrossSales(grossSales);

        validateCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
        "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
