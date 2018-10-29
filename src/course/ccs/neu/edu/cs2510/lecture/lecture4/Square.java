package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent a square
public class Square implements IShape {
    /*int x; // represent a top - left corner of the square
    int y;*/
    CartPt topLeft;
    int size;
    String color;

    public Square( CartPt topLeft, int size, String color ) {
        /*this.x = x;
        this.y = y;*/
        this.topLeft = topLeft;
        this.size = size;
        this.color = color;
    }


    @Override
    public double area() {
        return this.size * this.size;
    }

    @Override
    public double distanceToOrigin() {
        return this.topLeft.distanceToOrigin();
    }

    @Override
    public IShape grow( int inc ) {
        return null;
    }

    // return true if this area is bigger than that area of the given shape
    @Override
    public boolean isBiggerThan( IShape that ) {
        return this.area() > that.area();
    }

    public boolean contains( CartPt point ) {
        return (this.topLeft.x <= point.x) &&
                (point.x <= this.topLeft.x + this.size) &&
                (this.topLeft.y <= point.y) &&
                (point.y <= this.topLeft.y + this.size);
    }


}
