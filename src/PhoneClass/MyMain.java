package PhoneClass;

public class MyMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[]{
                new Phone(3458666, "Samsung", 100),
                new Phone(2138572, "iPhone", 120),
                new Phone(1049572, "Nokia", 150),
        };

        for (Phone phone : phones)
        {
            System.out.println(phone);
        }

        System.out.println();

        phones[0].receiveCall("Ivan");
        System.out.println("Your number is: " + phones[0].getNumber());
    }
}
