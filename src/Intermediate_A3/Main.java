package Intermediate_A3;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(new Customer("Annina", "Myhome 01", 5), 5000);
        DebitCardAccount dca1 = new DebitCardAccount(new Customer("John", "MyHome 02", 0), 2000);
        CreditCardAccount cca1 = new CreditCardAccount(new Customer("Jane", "MyHome 03", 5), 1000);

        System.out.println(cca1.getAccountBalance());
        try{
            cca1.withdrawMoney(6000);
        } catch(BankAcccountNegativeException c1){
            System.out.println(c1+ ": Cant go to minus!");
        }
        System.out.println(cca1.getAccountBalance());

        /*
        System.out.println(ba1.getCustomer().getCreditScore());
        try{
            ba1.getCustomer().setCreditScore(6);
        } catch(BadCreditScoreException b1){
            System.out.println(b1 + ": Cant change number to anything else but 0-5");
        }
        System.out.println(ba1.getCustomer().getCreditScore());
        */
    }
}
