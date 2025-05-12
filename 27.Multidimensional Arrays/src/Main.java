import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Multidimensional Arrays: Arrays of arrays, useful for representing matrices
//        or grids.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[1][1]); // Output: 5

//        Iterating Through Arrays: Using loops, typically for or enhanced for
//        loops.
        int[] arr = {1, 2, 3, 4, 5};
        for (int j : arr) {
            System.out.println(j);
        }

//        Enhanced for loop
        for (int num : arr) {
            System.out.println(num);
        }

//        Common Methods (Arrays Class): The java.util.Arrays class provides
//        utility methods for arrays.
//        Arrays.toString() : Converts the array to a string representation.
//        Arrays.sort() : Sorts the array.
//        Arrays.equals() : Compares two arrays.
//        Example:

        int[] array = {3, 1, 4, 1, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // Output: [1, 1, 3, 4, 5]
    }
}