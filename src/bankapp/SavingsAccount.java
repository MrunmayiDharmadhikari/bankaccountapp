package src.src.bankapp;

public class SavingsAccount extends Account {
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    public SavingsAccount(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }


    private void setSafetyDepositBox() {
        safetyDepositBoxID =(int) (Math.random()*Math.pow(10,3));
        getSafetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
    }


    @Override
    public void display() {
        System.out.println("ACCOUNT TYPE : Savings Account");
        super.display();
        System.out.println("Your Savings Account details are : " +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + getSafetyDepositBoxKey);
    }
    //props specific to savings account

    //constructor to initialize the savings props

    //list any methods specific to savings account
}
