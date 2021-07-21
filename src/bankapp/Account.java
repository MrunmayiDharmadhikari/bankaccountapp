package src.src.bankapp;

public abstract class Account implements InterestBaseRate {
    //list common properties for savings and checking accounts
    String name;
    String ssn;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;


    public Account(String name, String ssn, double initDeposit) {

        this.name = name;
        this.ssn = ssn;
        balance = initDeposit + 100;
        System.out.println(" NAME" + name);
        System.out.println("SSN " + ssn);
        System.out.println("BALANCE" + balance);
        index++;
        this.accountNumber = setAccountNumber();
    }



    private String setAccountNumber() {
        String lastTwoDigSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3));
        return lastTwoDigSSN + uniqueID + randomNum ;
    }

    public void display() {
        System.out.println("Name : " + name  + "Account Number ");
    }
    //constructor to set base properties and initialize the account

    //list common methods
}
