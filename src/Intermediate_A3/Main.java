package Intermediate_A3;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Annina", 5000);
        DebitCardAccount dca1 = new DebitCardAccount("John", 2000);
        CreditCardAccount cca1 = new CreditCardAccount("Jane", 3000);

        System.out.println(ba1.getAccountBalance());
        try{
            ba1.withdrawMoney(50);
        } catch(BankAcccountNegativeException c1){
            System.out.println(c1+ ": Cant go to minus!");
        }
        System.out.println(ba1.getAccountBalance());

    }
}
