package src.src.bankapp;

public class SavingsAccount extends Account {
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    public SavingsAccount(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("NEW SAVINGS ACCOUNT");
        System.out.println("ACCOUNT NUMBER " + accountNumber);



    }

    //props specific to savings account

    //constructor to initialize the savings props

    //list any methods specific to savings account
}
