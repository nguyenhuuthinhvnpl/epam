package course.ccs.neu.edu.cs2510.lecture.lecture3;

// present a book in a bookstore
public class Book {
    String title;
    String author;
    int price; // in dollars

    // the constructor
    public Book( String title, String author, int price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /* templare will go here */
    /* method definitons will go here */
    // compute sale price of this book given using
    // the given  discount rate (as a percentage)

    int salePrice( int discount ) {
        return this.price - this.price * discount / 100;
    }


}
