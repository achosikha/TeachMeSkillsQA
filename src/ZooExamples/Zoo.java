package ZooExamples;

public class Zoo {
    // Access Modifier -> модификатор доступа
    // public -> можешь получить доступ отовсюду
    // private -> доступ только у самого класса
    // protected -> только в рамках наследования и др. случай
    // default -> в рамках пакета
    private String animalName;
    private String animalType;
    private String animalColor;
    private String animalGender;
    private int animalAge;
    private double animalWeight;
    private static int amountOfAnimals = 0;

    // default variable
    String defaultVar = "Default Var";

    // public
    public String publicVar = "Public Var";

    // protected
    protected String protectedVar = "Protected Var";

    public Zoo(String animalName, String animalType, String animalColor,
               String animalGender, int animalAge, double animalWeight)
    {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalColor = animalColor;
        this.animalGender = animalGender;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
        this.amountOfAnimals++;
    }

    public static int getAmountOfAnimals() {
        return amountOfAnimals;
    }

    // No access modifier means default access modifier -> package level
    void getAllData()
    {
        System.out.println("Animal name: " + this.animalName);
        System.out.println("Animal type: " + this.animalType);
        System.out.println("Animal color: " + this.animalColor);
        System.out.println("Animal gender: " + this.animalGender);
        System.out.println("Animal age: " + this.animalAge);
        System.out.println("Animal weight: " + this.animalWeight);
    }

    private void getPrivateData()
    {
        System.out.println("Get Private Data...");
    }
}
