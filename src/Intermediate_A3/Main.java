package Intermediate_A3;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(new Customer("Annina", "Myhome 01", 5), 5000);
        DebitCardAccount dca1 = new DebitCardAccount(new Customer("John", "MyHome 02", 0), 2000);
        CreditCardAccount cca1 = new CreditCardAccount(new Customer("Jane", "MyHome 03", 3), 3000);

        System.out.println(cca1.getAccountBalance());
        try{
            cca1.withdrawMoney(4000);
        } catch(BankAcccountNegativeException c1){
            System.out.println(c1+ ": Cant go to minus!");
        }
        System.out.println(cca1.getAccountBalance());

        System.out.println(ba1.getCreditScore());
    }
}
