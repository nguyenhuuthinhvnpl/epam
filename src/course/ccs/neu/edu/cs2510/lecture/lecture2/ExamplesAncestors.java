package course.ccs.neu.edu.cs2510.lecture.lecture2;

public class ExamplesAncestors {
    IAT unknown = new Unknown();
    IAT mary = new Person("Mary", this.unknown, this.unknown);
    IAT robert = new Person("Robert", this.unknown, this.unknown);
    IAT john = new Person("John", this.unknown, this.unknown);
    IAT jane = new Person("Jane", this.mary, this.robert);
    IAT dan = new Person("Dan", this.jane, this.john);

    ExamplesAncestors() {
    }
}
