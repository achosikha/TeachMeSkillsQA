public class Employee {
    private String employerName;
    private String employerSurname;
    private String position;

    public Employee(String employerName, String employerSurname, String position)
    {
        this.employerName = employerName;
        this.employerSurname = employerSurname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee's name: " + this.employerName + "\n" +
                "Employee's surname: " + this.employerSurname + "\n" +
                "Employee's position: " + this.position + "\n";
    }
}
