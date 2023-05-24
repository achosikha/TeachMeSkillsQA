package Final;

public class BluePrint {
    private String name;

    public BluePrint(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // method getData cannot be overridden by other classes
    final void getData()
    {
        System.out.println("This method is final and cannot be overridden...");
    }
}
