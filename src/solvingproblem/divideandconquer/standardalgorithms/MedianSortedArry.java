package solvingproblem.divideandconquer.standardalgorithms;

public class MedianSortedArry {
    public static void main( String[] args ) {
     /* Driver program to test above function */

        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2)
            System.out.println("Median is " +
                    getMedian(ar1, ar2, n1));
        else
            System.out.println("arrays are of unequal size");

    }

    public static int getMedian( int[] ar1, int[] ar2, int n ) {
        int m1 = 0, m2 = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                m1 = m2;
                m2 = ar2[0];
            }

            if (j == n) {
                m1 = m2;
                m2 = ar1[0];
            }

            if (ar1[i] > ar2[j]) {
                m1 = m2;
                m2 = ar2[j];
                j++;
            } else {
                m1 = m2;
                m2 = ar1[i];
                i++;
            }
        }

        return (m1 + m2) / 2;
    }


}
