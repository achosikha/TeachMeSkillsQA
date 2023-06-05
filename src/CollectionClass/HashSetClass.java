package CollectionClass;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        getHashSet();
    }

    public static void getHashSet()
    {
        Set<String> hashSet = new java.util.HashSet<>(Arrays.asList("Kristina", "Ivan", "Julia", "Viktoria"));

        // unordered
        System.out.println(hashSet);

        // add
        hashSet.add("Archil");

        System.out.println(hashSet);

        System.out.println();

        ArrayList<String> value = new ArrayList<>(Arrays.asList("Ar", "Dr", "Bg"));
        Set<String> fromArrayListToHashSet = new HashSet<>(value);

        System.out.println(fromArrayListToHashSet);

        System.out.println(value);

        System.out.println();

        System.out.println(fromArrayListToHashSet.hashCode());

        System.out.println();

        Iterator<String> iteratorForHashSet = fromArrayListToHashSet.iterator();

        while(iteratorForHashSet.hasNext())
        {
            String tempValue = iteratorForHashSet.next();
            System.out.println(tempValue + " hash code is: " + tempValue.hashCode());
        }
    }
}
