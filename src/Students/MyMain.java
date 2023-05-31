package Students;

public class MyMain {
    public static void main(String[] args)
    {
        CreditCard mtb = new CreditCard("4751-2547-2365-2542", 1000);
        CreditCard alfa = new CreditCard("4872-2017-2365-2254", 2000);
        CreditCard alior = new CreditCard("4751-2547-2000-9872", 5000);
        mtb.getCreditCardsInfo();
        alfa.getCreditCardsInfo();
        alior.getCreditCardsInfo();
        System.out.println("Card mtb");
        mtb.addMoney(200);
        System.out.println("Card alfa");
        alfa.addMoney(300);
        System.out.println("Card alior");
        alior.downloadMoney(300);
    }

}