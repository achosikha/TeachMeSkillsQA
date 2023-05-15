package homework4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        forLoop();
    }

    public static void forLoop()
    {
        for (int index = 5; index >= 1; index--)
        {
            System.out.println(index);
        }
    }

    public static void switchYear()
    {
        int num = getInsert().nextInt();

        switch (num)
        {
            case 1:
            case 2:
                System.out.println("This is a Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is a Spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is a Summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is an Autumn.");
                break;
            case 12:
                System.out.println("This is a Winter.");
                break;
            default:
                System.out.println("There is no such month number in the year...");
                break;
        }
    }

    public static Scanner getInsert()
    {
        return new Scanner(System.in);
    }
}
