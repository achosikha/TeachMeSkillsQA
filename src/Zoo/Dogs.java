package Zoo;

public class Dogs extends Animal{
    public Dogs(String animalName, String animalType, String animalColor, String animalGender, int animalAge, double animalWeight) {
        super(animalName, animalType, animalColor, animalGender, animalAge, animalWeight);
    }

    @Override
    void swim() {
        System.out.println("Dogs swim...");
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    @Override
    public void justMethod() {

    }
}
