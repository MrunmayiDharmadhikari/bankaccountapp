package src.src.bankapp;

public class Application {
    public static void main(String[] args) {
        //Read  a CSV file then create new accounts based on that data

        CheckingAccount chkacc1 = new CheckingAccount(" Tom Wilson", "321456879", 1500);

        SavingsAccount saveacc1 = new SavingsAccount ("Rich Love","12345678", 1000);

    }
}
