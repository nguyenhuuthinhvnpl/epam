package solvingproblem.array;


public class SpiralOrder {
    public static void main( String[] args ) {
        int[][] matrix = {{2, 4, 6, 80}, {5, 9, 12, 16}, {2, 11, 5, 9}, {3, 2,
                1, 8}};

        spiralOrder(matrix, 4, 4);
    }

    public static void spiralOrder( int[][] matrix, int n, int m ) {
        int T = 0, L = 0, B = m - 1, R = n - 1; // index of directions
        int dir = 0;
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                    System.out.print(matrix[T][i]);
                    //dir = 1;
                }
                T++;
                System.out.println();
            } else if (dir == 1) {
                for (int i = T; i <= B; i++) {
                    System.out.print(matrix[i][R]);
                    //dir = 2;
                }
                R--;
                System.out.println();
            } else if (dir == 2) {
                for (int i = R; i >= L; i--) {
                    System.out.print(matrix[B][i]);
                }
                B--;
                System.out.println();
            } else if (dir == 3) {
                for (int i = B; i >= T; i--) {
                    System.out.print(matrix[i][L]);
                    //dir = 0;
                }
                L++;
                System.out.println();
            }
            dir = (dir + 1) % 4;
        }
    }
}
