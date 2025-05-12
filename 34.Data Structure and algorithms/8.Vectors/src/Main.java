import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        // Print the vector
        System.out.println("Vector: " + vector);

        // Get the size of the vector
        System.out.println("Size of vector: " + vector.size());
        // Get the capacity of the vector
        System.out.println("Capacity of vector: " + vector.capacity());
        // Get the element at index 2
        System.out.println("Element at index 2: " + vector.get(2));

        // Remove the element at index 1
        vector.remove(1);
        // Print the vector after removing the element
        System.out.println("Vector after removing element at index 1: " + vector);
    }
}