package com.pramp;

import java.io.*;
import java.util.*;

class IndexEqualsValueSearc {

    static int indexEqualsValueSearch( int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main( String[] args ) {
        int[] arr = new int[]{-8, 0, 2, 5};

        System.out.println(indexEqualsValueSearch(arr));
    }

}