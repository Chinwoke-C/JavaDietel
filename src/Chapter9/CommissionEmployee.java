package Chapter9;

public class CommissionEmployee {
    private  String firstName;
    private  String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        validateEmployee(grossSales, commissionRate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void validateGrossSales(double grossSales) {
        boolean isInvalid = grossSales < 0.0;
        if (isInvalid) throw new IllegalArgumentException("Gross sales must be above 0.0");


    }
    public void validateCommissionRate(double commissionRate){
        boolean isInvalid = commissionRate <= 0.0 || commissionRate > 1.0;
        if (isInvalid) throw new IllegalArgumentException("commission rate must be above 0.0 and below 1.0");

    }
    public void validateEmployee(double grossSales, double commissionRate){
        validateGrossSales(grossSales);

        validateCommissionRate(commissionRate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings(){

        return getCommissionRate() * getGrossSales();
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
    }
}
