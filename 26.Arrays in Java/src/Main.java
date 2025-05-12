//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Arrays are a fixed-size data structure that stores elements of the same type.
//        The size of an array is defined at the time of its creation and cannot be changed later.
//        Creation and Initialization:
//        Syntax: type[] arrayName = new type[arraySize];
//        Example:

        int[] intArray = new int[5]; // Declares an array of integers with size 5
        String[] stringArray = {"Hello", "World"}; // Initializes an array with elements

//        Accessing and Modifying Elements:
//        Access elements using the index, starting from 0.
//        Modify elements by assigning new values to specific indices.
//        Example:
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // Output: 1
        numbers[0] = 10;
        System.out.println(numbers[0]); // Output: 10


    }
}