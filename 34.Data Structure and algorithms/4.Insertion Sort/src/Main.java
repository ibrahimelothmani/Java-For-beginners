import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {-10, -20, 15, 8, 70, 10, 1, 5, 6};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

//    Insertion Sort builds the sorted list one element at a
//    time by placing each element in its correct position.
//    It’s like sorting a deck of cards by hand.
//    ⚙️ Time Complexity: O(n²)
//    ✨ Stability: Stable
//    📈 Best Use Case: Small datasets or when data is
//    nearly sorted.

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}