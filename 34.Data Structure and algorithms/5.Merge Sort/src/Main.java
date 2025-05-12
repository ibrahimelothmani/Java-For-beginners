
//    Merge Sort splits the array into halves, sorts each half,
//    and then merges them back together. It’s like
//    conquering a big task by breaking it into smaller,
//    more manageable tasks.
//    ⚙️ Time Complexity: O(n log n)
//    ✨ Stability: Stable
//    📈 Best Use Case: Sorting large datasets efficiently.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -20, 15, 8, 70, 10, 1, 5, 6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements to left and right arrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid); // Fixed source index

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right); // Added merge step
    }

    // Merge two sorted arrays
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}