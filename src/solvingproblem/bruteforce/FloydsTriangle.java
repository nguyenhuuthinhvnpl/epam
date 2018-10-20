package solvingproblem.bruteforce;

public class FloydsTriangle {
    public static void main( String[] args ) {
        int n = 4;
        floydTriangle(n);
    }

    public static void floydTriangle( int n ) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
