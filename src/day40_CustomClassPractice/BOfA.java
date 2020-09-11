package day40_CustomClassPractice;

public class BOfA {

    public static void main(String[] args) {

        BankAccount Massimo = new BankAccount();
        Massimo.setAccountInfo("Saving", "Massimo Ephesus", "123455786");

        Massimo.getAccountInfo();

        Massimo.deposit(1000);

        Massimo.checkBalance();

        Massimo.withDraw(500);

        Massimo.checkBalance(); // 500

        Massimo.withDraw(100000);

        Massimo.checkBalance();


    }



}
