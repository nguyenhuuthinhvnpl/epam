package solvingproblem.sortingandsearching;

public class JumpSearch {
    // Driver program to test function 
    public static void main( String[] args ) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        // Find the index of 'x' using Jump Search 
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located 
        System.out.println("\nNumber " + x +
                " is at index " + index);
    }

    public static int jumpSearch( int[] arr, int target ) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));

        // Finding the block where the element is present( if it is present)
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev > n) {
                return -1;
            }
        }

        // Doing linear search for the target in block beginning with prev
        while (arr[prev] < target) {
            prev++;

            // If we reach the next block or end of array, element is not
            // present
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr[prev] == target) {
            return prev;
        }

        return -1;
    }
}
