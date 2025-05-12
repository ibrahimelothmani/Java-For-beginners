import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arr = {-10, -20, 15, 8, 70, 10, 1, 5, 6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

//    Selection Sort finds the smallest element in the array
//    and places it in its correct position. It’s like picking the
//    smallest rock from a pile and lining them up one by
//    one.
//⚙️ Time Complexity: O(n²)
//✨ Stability: Not Stable
//📈 Best Use Case: When memory usage needs to be
//    minimal.

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // swap
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}