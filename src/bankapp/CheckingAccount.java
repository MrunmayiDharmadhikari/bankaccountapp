package src.src.bankapp;

public class CheckingAccount extends Account {
    //list properties specific to checking account . debit card and PIN.

    //constructor to initialize checking account properties.

    int debitNumber;
    int debitPin;

    public CheckingAccount(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("NEW CHECKING ACCOUNT");
        System.out.println("ACCOUNT NUMBER " + accountNumber);

    }
    //list any methods specific to the checking account.
}
