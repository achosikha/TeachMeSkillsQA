import java.util.Objects;

public class Just {


    public static void main(String[] args) throws CloneNotSupportedException {
        JustX obj = new JustX();
        System.out.println(obj.hashCode());
        JustX obj1 = obj;
        System.out.println(obj1.hashCode());
        obj1 = (JustX) obj.clone();
        System.out.println(obj1.hashCode());
        obj1.setName("asd");
        System.out.println(obj.compareTo(obj1));
    }
}

class JustX implements Cloneable, Comparable
{
    private String name = "JustX";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        JustX jO = (JustX) o;
        return (this.name.equals(jO.name)) ? 0 : -1;
    }
}
