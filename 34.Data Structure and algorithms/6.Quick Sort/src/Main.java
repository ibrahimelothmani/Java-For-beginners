import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {-10, -20, 15, 8, 70, 10, 1, 5, 6};
        System.out.println(Arrays.toString(quickSort(arr)));
    }


//    Quick Sort selects a pivot element and partitions the
//    array into elements smaller and larger than the pivot.
//    It’s like dividing a room into smaller groups and
//    sorting each group individually.
//    ⚙️ Time Complexity: O(n log n) (average) / O(n²) (worst)
//    ✨ Stability: Not Stable
//    📈 Best Use Case: When you need speed and don’t mind extra space.

    public static int[] quickSort(int[] arr) {
        // Base case: return if array is null or has 1 or fewer elements
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // Call helper method to sort the array in-place
        quickSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right partitions
            quickSortHelper(arr, low, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element

        // Compare each element with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }
}