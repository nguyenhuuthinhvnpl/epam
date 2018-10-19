package solvingproblem.array;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void main( String[] args ) {
        int[] arr = {9, 5, 7, 4, 6, 1, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //        System.out.println(Arrays.toString(arr));
        //        System.out.println(Arrays.toString(insertionSort(arr, arr
        // .length)));
    }

    public static int[] insertionSort( int[] arr, int n ) {
        for (int i = 1; i < arr.length; i++) {
            int hold = i;
            int value = arr[i];
            while (hold > 0 && value < arr[hold - 1]) {
                arr[hold] = arr[hold - 1];
                hold--;
            }
            arr[hold] = value;
        }
        return arr;
    }
}
