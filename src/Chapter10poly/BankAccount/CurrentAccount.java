package Chapter10poly.BankAccount;

public class CurrentAccount implements BankAccount{
    private int acctNum;
    private int balance = 0;
    private  boolean isForeign = false;

    public CurrentAccount(int acctNum){
        this.acctNum = acctNum;
    }

    @Override
    public int getAcctNum() {
        return acctNum;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public boolean isForeign() {
        return false;
    }

    @Override
    public void setForeign(boolean isForeign) {
        this.isForeign = isForeign;

    }

    @Override
    public void deposit(int amt) {
        balance += amt;
    }

    @Override
    public boolean hasEnoughCollateral(int loaNAmt) {
        return balance >= 2 * loaNAmt / 3;
    }
    public String toString(){
        return  String.format("Current account %d has a balance: %d is %s",acctNum,
                balance, (isForeign ? "foreign" : "domestic"));
    }
}
