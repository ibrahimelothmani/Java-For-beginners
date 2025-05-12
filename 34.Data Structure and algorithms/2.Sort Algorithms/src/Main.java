import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arr = {-10, -20, 15, 8, 70, 10, 1, 5, 6};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

// Bubble Sort Algorithms
//    Bubble Sort repeatedly compares adjacent elements
//    and swaps them if they’re in the wrong order. It's
//    simple but not the fastest. Think of it as the "lazy
//    river" of sorting algorithms.
//    ⚙️ Time Complexity: O(n²)
//    ✨ Stability: Stable
//    📈 Best Use Case: When simplicity matters more than speed.

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}