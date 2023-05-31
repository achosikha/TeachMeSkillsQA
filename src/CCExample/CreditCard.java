package CCExample;

public class CreditCard {
    private String name;
    private String account;
    private double balance;

    public CreditCard(String name, String account, double balance)
    {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    void addBalance(double balance)
    {
        this.balance += balance;
    }

    void cashOut(double balance)
    {
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Your card name is: " + this.name + "\n" +
                "Your card account is: " + this.account + "\n" +
                "Your balance is: " + this.balance + "\n";
    }

    void getInfo()
    {
        System.out.println("Your card name is: " + this.name);
        System.out.println("Your card account is: " + this.account);
        System.out.println("Your balance is: " + this.balance);
    }
}
