package solvingproblem.sortingandsearching;

import java.util.Arrays;

public class BubleSort {
    public static void main( String[] args ) {
        int[] intArr = {9, 4, 7, 5, 6};
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(bubleSort(intArr)));

    }

    private static int[] bubleSort( int[] intArr ) {
        int j = -1;
        while (j < intArr.length - 1) {
            for (int i = 0; i < intArr.length; i++) {
                if (i < intArr.length - 1 && intArr[i] > intArr[i + 1]) {
                    //                swap(intArr[i], intArr[i + 1]);
                    // Swap
                    int temp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = temp;
                }
                System.out.println(i + ". " + Arrays.toString(intArr));
            }
            j++;
        }
        //        System.out.println(Arrays.toString(intArr));
        return intArr;
    }

    //    private static void swap( int nr1, int nr2 ) {
    //        int temp = 0;
    //        temp = nr1;
    //        nr1 = nr2;
    //        nr2 = temp;
    //    }
}
