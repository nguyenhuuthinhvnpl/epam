package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent a circle shape
public class Circle implements IShape {
    //int x;
    //int y;
    CartPt center;
    int radius;
    String color;

    public Circle( CartPt center, int radius, String color ) {
//        this.x = x;
//        this.y = y;
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double distanceToOrigin() {
        return this.center.distanceToOrigin() - this.radius;
    }

    @Override
    public IShape grow( int inc ) {
        return null;
    }

    // return true if this area is bigger than the area of the given shape
    @Override
    public boolean isBiggerThan( IShape that ) {
        return this.area() > that.area();
    }

    public boolean contains( CartPt point ) {
        return this.center.distanceTo(point) < this.radius;
    }

    //
}
