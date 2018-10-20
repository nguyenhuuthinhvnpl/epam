package solvingproblem.greedyalgorithm.easy;

import java.util.Arrays;

public class GreedyWater {
    public static void main( String[] args ) {
        int[] arr = {5, 4, 3, 2};
        System.out.println(greedyWater(arr, 8));
    }

    public static int greedyWater( int[] arr, int containerWater ) {
        Arrays.sort(arr);
        int counter = 0;
        int cap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cap > containerWater || (cap + arr[i]) > containerWater) {
                break;
            }
            cap += arr[i];
            counter++;
        }
        return counter;
    }
}
