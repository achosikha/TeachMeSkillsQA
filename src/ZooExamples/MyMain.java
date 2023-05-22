package ZooExamples;

import ZooExamples.Zoo;

public class MyMain {
    // final immutable
    // Чтобы его создать, хоть где-то должна идти инициализация
    private final String CONSTANT; // if final write with capital letters
                                    // variables that hold unique values
                                    // and never change
    public MyMain()
    {
        this.CONSTANT = "Archil";
    }

    public static void main(String[] args) {
        // method();
        // только статические данные имеют право доступа к статическим данным
        // статические переменные принадлежат самому классу, а не его экземплярам
        accessModifier();
    }

    void method()
    {

    }

    public static void accessModifier()
    {
        Zoo lion = new Zoo("Leo", "Lion", "Yellow",
                "Female", 4, 45.6);

        Zoo wolf = new Zoo("Vasya", "Worl", "Grey",
                "Male", 4, 45.6);

        // access modifier for getAllData() is default - package
        lion.getAllData();

        // get private field
        // zoo. - private field - ERROR

        // get default var
        lion.defaultVar = "Default Access Modifier...";

        // public var
        lion.publicVar = "Public Access Modifier...";

        // protected
        lion.protectedVar = "Protected Access Modifier...";

        System.out.println("Amount of animals created based on Zoo Class is: " + Zoo.getAmountOfAnimals());
    }
}
