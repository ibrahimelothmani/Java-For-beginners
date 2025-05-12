import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Dynamic Sizing: Vectors automatically resize themselves when elements
//        are added or removed. The capacity grows by doubling itself when needed,
//        ensuring amortized constant time complexity for insertion.
//        Iteration: Similar to arrays, vectors can be iterated using loops.

        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        for (String s : vector) {
            System.out.println(s);
        }

//        Common Methods:
//        addElement(E obj) : Adds an element to the end.
//        removeElement(Object obj) : Removes the first occurrence of the object.
//                size() : Returns the number of elements.
//                capacity() : Returns the current capacity.
//        Example:

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(10);
        vector2.add(20);
        vector2.add(30);
        vector2.remove((Integer) 20); // Removes element 20
        System.out.println(vector2.size()); // Output: 2
        System.out.println(vector2.capacity()); // Output: Initial capacity (default is 10)

    }
}