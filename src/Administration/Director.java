package Administration;

public class Director extends Staff{
    public Director()
    {
        setPosition("Director");
    }

    @Override
    void getFullDetails() {
        System.out.println("Abstract class has been overriden by " + getPosition());
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }

    @Override
    public void blueColorWorkers() {
        System.out.println(getPosition() + " is not a blue color worker...");
    }

    // достучаться до переменной в интерфейсе
    void getStaffMemberVar()
    {
        System.out.println(Staff.interfaceName);
    }
}
