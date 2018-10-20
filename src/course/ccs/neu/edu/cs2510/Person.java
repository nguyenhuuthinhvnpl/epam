package course.ccs.neu.edu.cs2510;

class Person implements IAT {
    String name;
    IAT mom;
    IAT dad;

    public Person( String name, IAT mom, IAT dad ) {
        this.name = name;
        this.mom = mom;
        this.dad = dad;
    }
}