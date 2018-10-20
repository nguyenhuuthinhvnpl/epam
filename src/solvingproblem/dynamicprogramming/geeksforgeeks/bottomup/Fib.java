package solvingproblem.dynamicprogramming.geeksforgeeks.bottomup;

public class Fib {
    public static void main( String[] args ) {
        Fib f = new Fib();
        int n = 9;
        System.out.println("Fibonacci number is " + f.fib(n));

    }

    int fib( int n ) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];

        return f[n];
    }
}