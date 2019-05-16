package Intermediate_A3;

public class BankAccount {
    private String customerName;
    private double accountBalance;

    BankAccount(String customerName, double accountBalance){
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

        if((this.accountBalance - removeMoney) < 0){
            throw new BankAcccountNegativeException();
        } else {
            this.accountBalance -= removeMoney;
        }
    }
}
