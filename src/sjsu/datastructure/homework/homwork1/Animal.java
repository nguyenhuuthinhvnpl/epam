package sjsu.datastructure.homework.homwork1;

public class Animal implements Comparable {
    private String name;

    public Animal( String name ) {
        this.name = name;
    }

    public int compareTo( Object otherObject ) {
        return name.compareTo(((Animal) otherObject).name);
    }

    public String getName() {
        return this.name;
    }

}