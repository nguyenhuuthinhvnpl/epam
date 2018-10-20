package com.horstmann.cs49jprogramminginjava;

public class Angles {
    public static void main( String[] args ) {

    }

    /**
     * Converts the given angle to normalized radians.
     *
     * @param angle an angle
     * @return the equivalent value in radians between 0 (inclusive)
     * and 2π (exclusive).
     */
    public static double toRadian( int angle ) {
        double radian = 0;
        radian = angle * Math.PI / 180;
        return radian;
    }

    /**
     Converts the given angle to degrees without normalizing.
     @param angle an angle
     @return the closest degree value
     */
    //    public static int toDegrees(double angle)
    //    {
    //      . . .
    //    }
}
