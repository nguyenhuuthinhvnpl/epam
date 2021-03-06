package com.horstmann.cs49jprogramminginjava;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharReader {
    public static void main( String[] args ) throws IOException {
        int ascii = 0;
        int special = 0;
        int iso8859_1 = 0;
        int greek = 0;
        int notInBmp = 0;
        Reader in = new InputStreamReader(System.in);
        boolean more = true;
        while (more) {
            int next = in.read();
            if (next == -1) {
                more = false;
            } else {
                char ch = (char) next; // The character to analyze
                if (next > 0x7F)// ch is a ACII character
                {
                    ascii++;
                } else if (ch < 256) { // ch is a iso8859_1 character
                    iso8859_1++;
                } else if (0x0370 <= ch && ch >= 0x03FF) {
                    greek++;
                }
            }
        }
        System.out.println("ASCII: " + ascii);
        System.out.println("Special: " + special);
        System.out.println("ISO 8859-1: " + iso8859_1);
        System.out.println("Greek: " + greek);
        System.out.println("notInBmp: " + notInBmp);

    }
}
