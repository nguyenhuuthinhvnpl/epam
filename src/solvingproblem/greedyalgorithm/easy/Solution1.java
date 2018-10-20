package solvingproblem.greedyalgorithm.easy;

import java.util.Arrays;

/*
* Being a very busy person, you have exactly T time to do some interesting
* things
* and you want to do maximum such things*/
public class Solution1 {
    public static void main( String[] args ) {
        int[] A = {5, 2, 1, 3, 4};
        System.out.println(solution1(A, 6));
    }

    public static int solution1( int[] A, int t ) {
        int numbersOfThings = 0;
        int currentTime = 0;

        // Sort array A in non- decreasing order
        //        sortedTime(A);
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));

        // Choose the thing that will take min time
        for (int i = 0; i < A.length; i++) {
            currentTime += A[i];
            if (currentTime > t) {
                break;
            }
            numbersOfThings++;
        }
        System.out.println(currentTime);
        return numbersOfThings;
    }

    private static int[] sortedTime( int[] arr ) {
        // Use bubble sort
        for (int i = 0; i < arr.length - 1; i++) {

            int temp = 0;

            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }


}
