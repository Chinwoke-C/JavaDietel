package Chapter10poly;

public class PayableTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[]{
                new Invoice("01234","Seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "8888-88-888",1200.00)
        };
        System.out.println(
                "invoices and employees processed polymorphically:"
        );
        for (Payable currentPayable : payableObjects){
            System.out.printf("%n%s %n payment due: $%,.2f",currentPayable.toString(), currentPayable.getPaymentAmount());
        }
    }
}
