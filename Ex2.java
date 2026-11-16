
// מגישים: בלייב מור וחיים אשרף 50/5

public class Ex2 {

    // Print numbers that are greater than their two neighbors
    public static void printBigger(int[] arr, int size) {

        // Check if the array and size are valid
        if (arr == null || size < 0 || size > arr.length) {
            return;
        }

        // Stop when there are less than three elements
        if (size < 3) {
            return;
        }

        // Check the element and its two neighbors
        if (arr[size - 2] > arr[size - 3] &&
            arr[size - 2] > arr[size - 1]) {
            System.out.println(arr[size - 2]);
        }

        printBigger(arr, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 4, 5};

        printBigger(arr, arr.length);
    }
}

// סיבוכיות: O(n)