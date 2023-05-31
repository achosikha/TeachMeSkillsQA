package CCExample;

// Inheritance, Composition, Delegation
public class MyMain {
    public static void main(String[] args) {
        CreditCard bg = new CreditCard("Archil Sikharulidze", "45005950550", 1000);

        bg.addBalance(500);
        bg.cashOut(956);

        bg.getInfo();

        System.out.println();

        System.out.println(bg);
    }
}
