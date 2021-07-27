package src.src.bankapp;

public class CheckingAccount extends Account {
    //list properties specific to checking account . debit card and PIN.

    //constructor to initialize checking account properties.

    int debitNumber;
    int debitPin;

    public CheckingAccount(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate()*.15;
    }

    private void setDebitCard() {
        debitNumber = (int) (Math.random()*Math.pow(10,12));
        debitPin = (int) (Math.random()*Math.pow(10,4));
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ACCOUNT TYPE : Checking Account");
        System.out.println("CARD : " + this.debitNumber);
        System.out.println("PIN : " + this.debitPin);
    }

    //list any methods specific to the checking account.
}
