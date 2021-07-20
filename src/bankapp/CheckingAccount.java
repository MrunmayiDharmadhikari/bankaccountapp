package src.src.bankapp;

public class CheckingAccount extends Account {
    //list properties specific to checking account . debit card and PIN.

    //constructor to initialize checking account properties.

    int debitNumber;
    int debitPin;

    public CheckingAccount(String name) {
        super(name);
        System.out.println("NEW CHECKING ACCOUNT");
    }
    //list any methods specific to the checking account.
}
