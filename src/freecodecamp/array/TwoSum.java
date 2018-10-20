package freecodecamp.array;

import java.util.Arrays;

public class TwoSum {
    public static void main( String[] args ) {
        int[] arr = {2, 7, 11, 5};
        int target = 9;
        int[] indices = twoSum(arr, target);
        System.out.println(Arrays.toString(indices));
    }

    public static int[] twoSum( int[] arr, int target ) {
        int[] indicies = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    indicies[counter] = i;
                    indicies[counter + 1] = j;
                }
            }
        }
        return indicies;
    }
}
