package solvingproblem.sortingandsearching;

public class InterpolationSort {
    // Array of items on which search will 
    // be conducted. 
    static int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
            24, 33, 35, 42, 47};

    public static void main( String[] args ) {
        int target = 18;// Element to be searched
        int index = interpolationSort(target);
        System.out.println(index);
    }

    public static int interpolationSort( int target ) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi && arr[lo] <= target && target <= arr[hi]) {
            // Probing the positon of target with uniform distribution
            int pos = lo + (target - arr[lo]) * (hi - lo) / (arr[hi] - arr[lo]);

            if (arr[pos] == target) {
                return pos;
            }

            if (arr[pos] < target) {
                lo = pos + 1;
            } else {
                hi = pos - 1;
            }
        }
        return -1;
    }
}
