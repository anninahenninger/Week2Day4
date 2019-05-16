package Intermediate_A3;

public class BankAccount {
    private Customer customer;
    private double accountBalance;

    BankAccount(Customer customerName, double accountBalance){
        this.customer = customerName;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addMoney(double addMoney){
        this.accountBalance += addMoney;
    }

    public void withdrawMoney(double removeMoney) throws BankAcccountNegativeException{
        if((this.accountBalance - removeMoney) < DebitCardAccount.limit){
            throw new BankAcccountNegativeException();
        } else {
            this.accountBalance -= removeMoney;
        }
    }
}
