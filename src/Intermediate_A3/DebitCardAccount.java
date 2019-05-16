package Intermediate_A3;

public class DebitCardAccount extends BankAccount{

    public static final double limit = 0;

    DebitCardAccount(Customer customerName, double accountBalance){
        super(customerName, accountBalance);
    }
}
