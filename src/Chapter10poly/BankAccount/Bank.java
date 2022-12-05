package Chapter10poly.BankAccount;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, BankAccount> accounts;
    private int nextAcct;
    int n;

    public Bank(HashMap<Integer,BankAccount> accounts){
        this.accounts = accounts;
        nextAcct = n;
    }
    public int newAccount(int type, boolean isForeign){
        int acctNum = nextAcct++;
        BankAccount ba;
        if (type == 1){
            ba = new SavingsAccount(acctNum);
        }
        else {
            ba = new CurrentAccount(acctNum);
            ba.setForeign(isForeign);
            accounts.put(acctNum, ba);
        }
            return acctNum;

        }
        public int getBalance(int acctNum){
        BankAccount ba = accounts.get(acctNum);
            return ba.getBalance();
        }
        public void addInterest(){
            for(BankAccount ba : accounts.values()) {
                if (ba instanceof SavingsAccount){
                    SavingsAccount sa = (SavingsAccount) ba;
                    sa.addInterest();
                }
            }
        }


    }

