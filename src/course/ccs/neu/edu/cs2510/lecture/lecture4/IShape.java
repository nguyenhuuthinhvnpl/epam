package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent a geometric shape
public interface IShape {

    // compute  the area of this shape
    double area();

    // compute the distance from the this shape to origin
    double distanceToOrigin();

    // increase the size of this shape by given  increment
    IShape grow( int inc );

    // is the area of this shape bigger than  the area of the given shape
    boolean isBiggerThan( IShape that );

    // return true if the given point within the shape
    boolean contains(CartPt point);
}
