package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent a square
public class Square implements IShape {
    int x; // represent a top - left corner of the square
    int y;
    int size;
    String color;

    public Square( int x, int y, int size, String color ) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }


    @Override
    public double area() {
        return this.size * this.size;
    }
}
