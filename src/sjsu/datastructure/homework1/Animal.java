package sjsu.datastructure.homework1;

public class Animal implements Comparable {
    private String name;

    public Animal( String name ) {
        this.name = name;
    }

    public int compareTo( Object otherObject ) {
        int value = name.compareTo(((Animal) otherObject).name);
        return value;
    }

    public String getName() {
        return this.name;
    }

}