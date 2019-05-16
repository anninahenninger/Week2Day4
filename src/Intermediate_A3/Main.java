package Intermediate_A3;

import Intermediate_A2_Soup.NoSoupVolumeDefined;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Annina", 5000);

        System.out.println(ba1.getAccountBalance());

        try{
            ba1.withdrawMoney(50);
        } catch(BankAcccountNegativeException c1){
            System.out.println(c1+ ": Cant go to minus!");
        }
        System.out.println(ba1.getAccountBalance());
    }
}
