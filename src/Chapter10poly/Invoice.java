package Chapter10poly;

public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public void validateQuantity(int quantity){
        boolean isInvalid = quantity < 0;
        if (isInvalid) throw new IllegalArgumentException("quantity must be >= 0");
    }
    public void validatePricePerItem(double pricePerItem){
        boolean isInvalid = pricePerItem < 0.0;
        if (isInvalid) throw new IllegalArgumentException("price per item must be >= 0");

    }
    public void validateInvoice(int quantity, double pricePerItem){
        validateQuantity(quantity);
        validatePricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice","part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(),"price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}
