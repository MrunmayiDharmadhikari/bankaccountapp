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

        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();


    private String setAccountNumber() {
        String lastTwoDigSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3));
        return lastTwoDigSSN + uniqueID + randomNum ;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing : $" + amount);
        printBalance();
    }

    public void transfer(String destination, double amount) {
        balance = balance - amount;
        System.out.println("Transferring : $" + amount + " to " + destination);
        printBalance();
    }
    public  void printBalance() {
        System.out.println("Balance :  $" + balance);
    }
    public void display() {
        System.out.println("Name : " + name  + "\nAccount Number " + accountNumber
                + "\nBank Balance : " + balance
                + "\nRATE : " + rate + "%");
    }
    //constructor to set base properties and initialize the account

    //list common methods
}
