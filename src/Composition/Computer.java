package Composition;

public class Computer implements SomeMethods {
    private String model;
    private String ramType;
    private int ramSize;
    private String videoCard;
    private HardDrive hardDrive;
    private CPU cpu;

    public Computer(String model, String ramType, int ramSize, String videoCard,
                    HardDrive hardDrive, CPU cpu)
    {
        this.model = model;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.videoCard = videoCard;
        this.hardDrive = hardDrive; // тут передается не значение, а ссылка на значения
        this.cpu = cpu; // тут передается не значение, а ссылка на значения
    }

    @Override
    public String toString() {
        return model + " " + ramType +
                " " + ramSize + " " + videoCard + " " +
                this.hardDrive.getHardDriveModel() + " " + this.hardDrive.getHardDriveSize() + " "
                + this.cpu.getCpuModel() + " " + this.cpu.getCpuFrequency();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void justMethod() {
        System.out.println("Just Method for General");
    }
}
