package bankaccountapp;

public class Checking extends Account {
int debitCardNumber;
int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        System.out.println("New Checking Account");
    }

}
