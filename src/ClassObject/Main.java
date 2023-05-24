package ClassObject;

public class Main {
    public static void main(String[] args) {
        // Object -> super class, may contain everything
        Object[] obj = new Object[]{
                "Archil",
                34,
                56.5,
                new String[] {"A", "B"},
                'C',
                new Human("Archil Sikharulidze")
        };

        System.out.println(obj[0]);

        // String telephoneNumber = 9784568; -> '9', '7' -> 2 * 7 = 14 byte * 8 = 112 byt
        // int telephoneNumInt = 9784568; -> 4 byte 32 byt

        // int x = 34;
        // Integer num = 100;
    }
}

class Human
{
    private String fullname;

    public Human(String fullname)
    {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }
}