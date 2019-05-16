package Intermediate_A3;

public class DebitCardAccount extends BankAccount{

    public static double limit = 0;

    DebitCardAccount(String customerName, double accountBalance){
        super(customerName, accountBalance);
    }
}
