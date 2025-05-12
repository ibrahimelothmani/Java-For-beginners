import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Synchronization and Thread Safety: Vectors are synchronized, making
//        them thread-safe. This is achieved by synchronizing methods, which can
//        lead to performance overhead. For better performance in a single-threaded
//        context, consider using ArrayList .
//        Enumeration and Iterators: Vectors support both Enumeration and Iterator
//        interfaces for traversing elements. Enumeration is an older approach, while
//        Iterator is more modern and provides methods like remove .
//        Example:

        Vector<String> vector = new Vector<>();
        vector.add("X");
        vector.add("Y");
        vector.add("Z");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

//        Conversion to Other Collections: Vectors can be converted to other
//        collections like ArrayList or arrays.
//        Example:

        Vector<String> vector2 = new Vector<>();
        vector2.add("One");
        vector2.add("Two");

//      Convert to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(vector2);
        System.out.println(arrayList);
//      Convert to Array
        String[] array = vector2.toArray(new String[0]);
        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));

//        Legacy Nature: Vectors are considered a legacy class. Although they are
//        still used, modern applications often prefer ArrayList for non-thread-safe
//        implementations and CopyOnWriteArrayList or other concurrent collections for
//        thread-safe implementations.
    }
}