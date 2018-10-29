package solvingproblem.searching;


import java.util.ArrayList;
import java.util.Arrays;

public class MinsSumPair {
    public static void main( String[] args ) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        System.out.println(Arrays.toString(minSumPair(arr, 6)));
    }

    public static int[] minSumPair( int[] arr, int n ) {
        int l = 0;
        int r = n - 1; // last index of array
        int min_l = l, min_r = r;
        int sum, min = Integer.MAX_VALUE;

        // sort the list by quicksort
         sort(arr, l, r);
        //
        while (l < r) {
            sum = arr[l] + arr[r];
            if (Math.abs(sum) < Math.abs(min) ) {
                min = sum;
                min_l = l;
                min_r = r;
            }

            if (sum > 0) {
                r--;
            }else{
                l++;
            }
        }

        int [] pair ={arr[min_l], arr[min_r]};
        return pair;
    }

    private static void sort( int[] arr, int low , int hight ) {
        if(low < hight){
            int pivotIndex = partiton(arr, low, hight);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, hight);
        }
    }

    private static int partiton( int[] arr, int low, int hight ) {
        int pivot = arr[hight];
        int i = low -1;
        int j = hight - 1;
        int k = 0;
        while (i < j ) {
            if (arr[k] > pivot) {
                i++;
            }else{
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        int temp_2 = arr[hight];
        arr[hight] = arr[i + 1];
        arr[i + 1] = temp_2;
        return (i+1);
    }
}
