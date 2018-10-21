package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent a circle shape
public class Circle implements IShape {
    int x;
    int y;
    int radius;
    String color;

    public Circle( int x, int y, int radius, String color ) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
