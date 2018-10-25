package sjsu.datastructure.homework1;

public class Utility {
    public static Comparable max( Comparable objs[] ) {
        Comparable max = objs[0];
        for (int i = 0; i < objs.length; i++) {
            if (max.compareTo(objs[i]) > 0) {
                max = objs[i];
            }
        }
        return max;
    }
}