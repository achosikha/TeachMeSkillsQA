package Composition;

public class PC4 extends Computer{
    public PC4(String model, String ramType, int ramSize, String videoCard, HardDrive hardDrive, CPU cpu) {
        super(model, ramType, ramSize, videoCard, hardDrive, cpu);
    }

    @Override
    public void justMethod() {
        System.out.println("This method is being called from PC$");
    }

    @Override
    public void defaultMsg() {
        System.out.println("This default method has been overridden...");
    }
}
