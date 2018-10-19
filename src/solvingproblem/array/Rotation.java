package solvingproblem.array;

import java.util.ArrayList;

public class Rotation {
    public static void main( String[] args ) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);

        System.out.println(rotation(A, 1));
    }

    public static ArrayList<Integer> rotation( ArrayList<Integer> A, int B ) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (B > A.size()) {
                B = B % A.size();
            }
            if ((i + B) < A.size()) {
                ret.add(A.get(i + B));
            } else {
                ret.add(A.get(i + B - A.size()));
            }
        }

        return ret;
    }
}
