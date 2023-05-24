package Cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car bmw = new Car("BMW", "Black", new String[]{"NON"});
        Car bmwNew = (Car) bmw.clone();

        System.out.println("Class bmw: " + bmw);
        System.out.println("Class bmw hashCode: " + bmw.hashCode());

        System.out.println();

        System.out.println("Class bmwNew: " + bmwNew);
        System.out.println("Class bmwNew hashCode: " + bmwNew.hashCode());

        System.out.println("bmw == bmwNew:" + (bmw == bmwNew));
        System.out.println("bmw.hashCode == bmwNew.hashCode: " + (bmw.hashCode() == bmwNew.hashCode()));

        // Interfaces: Comparator & Comparable
        if (bmw.compareTo(bmwNew) == 0)
        {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal...");
        }

        bmwNew.setModel("Mercedes");

        System.out.println();

        if (bmw.compareTo(bmwNew) == 0)
        {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal...");
        }
    }
}
