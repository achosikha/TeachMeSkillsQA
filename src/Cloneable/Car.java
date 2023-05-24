package Cloneable;

import java.util.Arrays;
import java.util.Comparator;

// Special interface Cloneable (override clone)
public class Car implements Cloneable, Comparable, Comparator {
    private String model;
    private String color;
    private String[] spareParts;

    public Car (String model, String color, String[] spareParts) {
        this.model = model;
        this.color = color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length); // когда работаем с массивами
        // надо убедиться, что мы вкладываем не ссылку, а значение
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String[] getSpareParts() {
        return spareParts;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Comparable
    @Override
    public int compareTo(Object o) {
        Car obj = (Car) o;
        return (this.model.equals(obj.model)) ? 0 : -1;
    }

    // Comparator
    @Override
    public int compare(Object o1, Object o2) {
        // Object1 -> obj, Object2 -> obj2

        // 0 - true, -1 -> false
        return 0;
    }
}

