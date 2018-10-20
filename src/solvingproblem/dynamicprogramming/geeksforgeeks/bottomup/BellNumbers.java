package solvingproblem.dynamicprogramming.geeksforgeeks.bottomup;

public class BellNumbers {
    public static void main( String[] args ) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bell numbers are " + bellNumbers(i));

        }
    }

    public static int bellNumbers( int n ) {
        int[][] bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
            }
        }
        return bell[n][0];
    }
}
