package CreditCard;

public class MyMain {
    public static void main(String[] args) {
        // To Start CreditCard
        CreditCard tbc = new CreditCard("000TBC8606845", 100);
        CreditCard bog = new CreditCard("098BOG2138995", 10000);
        CreditCard liberty = new CreditCard("0924LBT9232385", 10);

        tbc.getCreditCardInfo();
        System.out.println();
        bog.getCreditCardInfo();
        System.out.println();
        liberty.getCreditCardInfo();

        tbc.cashOut(40);
        bog.cashOut(400);
        liberty.cashOut(5);

        System.out.println();

        tbc.getCreditCardInfo();
        System.out.println();
        bog.getCreditCardInfo();
        System.out.println();
        liberty.getCreditCardInfo();

        System.out.println();

        tbc.addAmount(100);
        bog.addAmount(4);
        liberty.addAmount(11);
        System.out.println();

        tbc.getCreditCardInfo();
        System.out.println();
        bog.getCreditCardInfo();
        System.out.println();
        liberty.getCreditCardInfo();
    }
}
