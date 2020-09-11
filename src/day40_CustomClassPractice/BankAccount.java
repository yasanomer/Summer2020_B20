package day40_CustomClassPractice;
/*
BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance, 4.AccountType

      	Actions:
      		1. CheckBalance,   2. deposit,  3. withdraw


          requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
            3. user should be able to see their balance




this: refers to object instances
    this.  we only use it to call instance if local variable has the same name with instance variables



instance: each object has its own copy
 */
public class BankAccount {  String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType, String name, String acctNum){ // sets the info
        this.accountType = clientAccountType;
        this.accountHolder = name;
        this.accountNumber = acctNum;
    }

    public void getAccountInfo(){ // displays account info
        System.out.println("============================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("============================");
    }


    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance += amount;
    }

    public void withDraw(double amount){
        if(amount > balance){
            System.out.println("not enough balance");
            return; //
        }

        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
        balance -= amount;

    }



}
