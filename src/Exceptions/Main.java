package Exceptions;

public class Main {
    public static void main(String[] args) {
        // Ошибки, которые не отлавливает компилятор
        // У нас также, могут появится ошибки, которые связаны не с нашим кодом, а с внешними ресурсами
        // Ошибки связанные с железкой (комп)
        sum(10, 0);
        exceptionArray();
    }

    public static void sum(int x, int y)
    {
        try
        {
            System.out.println(x / y);
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("You have tried to divide " + x + " on " + y);
        }

        System.out.println("Compt continues working...");
    }

    public static void exceptionArray()
    {
        int[] nums = new int[]{1, 2,3};

        try {
            for (int el = 0; el <= nums.length; el++)
            {
                System.out.println(nums[el]);
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e.getMessage());
        }

        System.out.println("It is still reachable...");
    }
}
