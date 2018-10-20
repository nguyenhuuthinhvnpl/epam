package solvingproblem.dynamicprogramming.geeksforgeeks.bottomup;

public class Factorial {
    public static void main( String[] args ) {
        int n = 3;
        System.out.println(dp(n));
    }

    public static int dp( int n ) {
        int dp = 1;
        for (int i = 1; i <= n; i++) {
            dp = dp * i;
        }
        return dp;
    }
}
