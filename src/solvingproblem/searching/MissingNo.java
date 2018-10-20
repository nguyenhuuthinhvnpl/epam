package solvingproblem.searching;
/*
* You are given a list of n-1 integers and these integers are in the range of
 * 1 to n. There are no duplicates in list. One of the integers is missing in
  * the list. Write an efficient code to find the missing integer.*/

public class MissingNo {
    public static void main( String[] args ) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(missingNo(arr, 8));
    }

    public static int missingNo( int[] arr, int nr ) {
        int total = ((arr[arr.length - 1] + 1) * arr[arr.length - 1]) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        total = total - sum;
        return total;
    }

}
