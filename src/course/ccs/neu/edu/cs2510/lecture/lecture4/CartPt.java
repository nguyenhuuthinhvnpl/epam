package course.ccs.neu.edu.cs2510.lecture.lecture4;

// represent 2-D point by Cartesian coordinate
public class CartPt {
    int x;
    int y;

    public CartPt( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    // compute the distance  from this point  to the origin
    double distanceToOrigin(){
        return Math.sqrt(this.x * this.y + this.x * this.y);
    }

    // compute distance to a given point
    double distanceTo(CartPt that) {
        return Math.sqrt(
                (this.x - that.x) * (this.x - that.x)
                        + (this.y - that.y) * (this.y - that.y));
    }


}
