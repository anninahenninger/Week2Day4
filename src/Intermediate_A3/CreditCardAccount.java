package Intermediate_A3;

public class CreditCardAccount extends BankAccount{

    public static final double limit = -3500;

    CreditCardAccount(Customer customerName, double accountBalance){
        super(customerName, accountBalance);
    }
    /*
    @Override
    public void withdrawMoney(double removeMoney) throws BankAcccountNegativeException{

        if((this.getAccountBalance() - removeMoney) < limit){
            throw new BankAcccountNegativeException();
        } else {
            double acB = this.getAccountBalance();
            acB -= removeMoney;
            this.setAccountBalance(acB);
        }
    }
     */
}
