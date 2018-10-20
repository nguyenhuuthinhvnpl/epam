package solvingproblem.divideandconquer.standardalgorithms;

public class MaxSubArraySum {
    public static void main( String[] args ) {
        int[] arr = {2, 3, 4, 5, 7};
        int n = arr.length;
        System.out.println(maxSubArraySum(arr, 0, n - 1));
    }

    static int maxSubArraySum( int[] arr, int l, int h ) {
        if (l == h) {
            return arr[l];
        }
        int m = (l + h) / 2;
        return Math.max(Math.max(maxSubArraySum(arr, l, m), maxSubArraySum
                (arr, m + 1, h)), maxCrossingSum(arr, l, m, h));

    }

    static int maxCrossingSum( int[] arr, int l, int m, int h ) {
        int sum = 0;
        int lef_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = arr[i] + sum;
        }

        if (sum > lef_sum) {
            lef_sum = sum;
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            sum = sum + arr[i];
        }

        if (sum > right_sum) {
            right_sum = sum;
        }

        return lef_sum + right_sum;
    }
}
