package src.src.bankapp;

public abstract class Account implements InterestBaseRate {
    //list common properties for savings and checking accounts
    String name;
    String ssn;
    double balance;

    String accountNumber;
    double rate;


    public Account(String name) {

        System.out.println("NAME : " + name);
        System.out.print("NEW ACCOUNT : ");

    }
    //constructor to set base properties and initialize the account

    //list common methods
}
