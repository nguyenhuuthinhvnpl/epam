package solvingproblem.dynamicprogramming.geeksforgeeks.topdown;

public class Fibonacci {
    final int MAX = 100;
    final int NIL = -1;

    int lookup[] = new int[MAX];

    public static void main( String[] args ) {
        Fibonacci f = new Fibonacci();
        int n = 6;
        f._initialize();
        System.out.println("Fibonacci number is " + f.fib(n));
    }

    /* Initialize NIL value in look up table*/
    void _initialize() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = NIL;
        }
    }

    int fib( int n ) {
        if (lookup[n] == NIL) {
            if (n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n - 1) + fib(n - 2);
        }
        return lookup[n];
    }


}
