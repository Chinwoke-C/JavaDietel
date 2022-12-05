package Chapter10poly.BankAccount;

public interface BankAccount {
    int getAcctNum();
    int getBalance();
     boolean isForeign();
    void setForeign(boolean isForeign);
    void deposit(int amt);
    boolean hasEnoughCollateral(int loaNAmt);
    String toString();


}
