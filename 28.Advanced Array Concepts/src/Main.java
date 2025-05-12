import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Array Manipulation: Involves operations like shifting, rotation, and resizing
//        (usually by creating a new array and copying elements).
//        Dynamic Array Alternatives: Since arrays have a fixed size, dynamic data
//        structures like ArrayList are often used when the size needs to change
//        frequently.
//        Memory Considerations: Arrays are stored in contiguous memory
//        locations. This can lead to efficient data access but may also cause
//        memory fragmentation if the array size is large.
//        Example of Dynamic Resizing:

        int[] original = {1, 2, 3};
        int[] resized = new int[original.length + 2];
        System.arraycopy(original, 0, resized, 0, original.length);
        resized[3] = 4;
        resized[4] = 5;
        System.out.println(Arrays.toString(resized)); // Output:[1, 2, 3, 4, 5]
    }
}