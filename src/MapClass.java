import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Employer, Employee> staff = new HashMap<>();

        staff.put(new Employer("ASDA"), new Employee("Archil", "Sikharulidze", "IT"));
        staff.put(new Employer("Sansbury"), new Employee("Olga", "Kislaya", "QA Automatization"));

        // lambda expression = (_parameters) -> _body_function/method
        staff.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
