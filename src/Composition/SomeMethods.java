package Composition;

public interface SomeMethods {
    void justMethod();

    default void defaultMsg()
    {
        System.out.println("Print this if the method is not overriden...");
    }
}
