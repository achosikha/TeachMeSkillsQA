import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Создать метод, который получает данные человека и их выводит
        getPersonalData();

        // Создать метод, который получает символ и выводит сам сивол вместе с его чичловым значением
        //charToInt();

        // Написать метод с вычислением BMI
        // getBMI();
    }

    public static void getPersonalData()
    {
        Scanner cout = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = cout.nextLine();

        System.out.print("Please, enter your surname: ");
        String surname = cout.nextLine();

        System.out.print("Please, enter your age: ");
        int age = cout.nextInt();

        System.out.print("Please, enter your height: ");
        int height = cout.nextInt();

        System.out.print("Please, enter your weight: ");
        float weight = cout.nextFloat();

        System.out.println();

        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);
    }

    public static void charToInt() throws IOException {
        Scanner cout = new Scanner(System.in);

        System.out.print("Please enter a symbol: ");
        char symbol = (char) cout.nextInt(); // char - 0 - 255 (ASCII), int 67 -> (char)

        System.out.println("You have entered a symbol: " + symbol);
        System.out.println("This symbols numeric meaning is: " + (int) symbol);

        // int oneNumber = System.in.read(); // one element per buffer

        // int oneSymbol = cout.nextLine().charAt(0);
        // String - Archil - char 'A' 'r' 'c' 'h' 'i' 'l' (array - index[0])
    }

    public static void getBMI()
    {
        Scanner cout = new Scanner(System.in);

        // enter height
        System.out.print("Please, enter your height: ");
        double height = cout.nextDouble();
        height = (height * height) / 10000;

        // enter weight
        System.out.print("Please, enter your weight: ");
        double weight = cout.nextDouble();

        // BMI = weight / (height*height)
        double BMI = weight / height;

        System.out.println("Your BMI is: " + BMI);
        cout.close();
    }

    public static void parseVariables()
    {
        // неявное преобразование
        // от малого к высокому - from byte to double (long)

        // преобразование путем понижение ранка переменной - когда от double (long) к byte
        // cast - (_date_type) _variable : (char) number;

        // Несовместимые типы данных
        String number = "1221";

        // No casting & no hidden transformation
        // int intNum = (int) number; // error
        // String numNum = (String) intNum; // error

        // Parsing
        int intNum = Integer.parseInt(number); // from String to Integer
        // Integer -> class, method parseInt(String _var)

        String getValueOf = String.valueOf(intNum); // from int to String
    }
}