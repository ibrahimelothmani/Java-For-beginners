import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Vectors are part of the java.util package and implement the List interface.
//        Unlike arrays, vectors are dynamic and can grow or shrink in size. They are
//        synchronized, making them thread-safe but potentially less efficient than other
//        list implementations.

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        System.out.println(vector);


//        Accessing and Modifying Elements:
//        Access elements using the get method.
//        Modify elements using the set method.
//        Example:

        Vector<String> vec = new Vector<>();
        vec.add("Hello");
        vec.add("World");
        System.out.println(vec.get(0)); // Output: Hello
        vec.set(1, "Java");
        System.out.println(vec.get(1)); // Output: Java

    }
}