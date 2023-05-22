package CreditCard;

public class CreditCard {
    private double balance;
    private String account;

    public CreditCard()
    {
        this.account = "XXXX-XXXX-XXXX-XXXX";
    }
    public CreditCard(String account, int balance)
    {
        this.account = account;
        this.balance = balance;
    }

    void getCreditCardInfo()
    {
        System.out.println("Credit Card Number is: " + this.account);
        System.out.println("Credit Card Balance is: " + this.balance);
    }

    void addAmount(int amount)
    {
        this.balance += amount;
    }

    void cashOut(int amount)
    {
        this.balance -= amount;
    }
}