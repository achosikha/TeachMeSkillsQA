public class Just {


    public static void main(String[] args) throws CloneNotSupportedException {
        JustX obj = new JustX();
        System.out.println(obj.hashCode());
        JustX obj1 = obj;
        System.out.println(obj1.hashCode());
        obj1 = (JustX) obj.clone();
        System.out.println(obj1.hashCode());
    }
}

class JustX implements Cloneable
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
}
