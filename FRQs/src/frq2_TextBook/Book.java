package frq2_TextBook;

/**
 * Class Book is part of Question 2 from the FRQs in the
 * 2022 AP Computer Science A exam.
 * Problem definition from page 8 in:
 * https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 */
public class Book {
    /** The title of the book */
    private String title;
    
    /** The price of the book */
    private double price;
    
    /** Creates a new Book with given title and price */
    public Book(String bookTitle, double bookPrice) {
        /* implementation not relevant */
    }
    
    /** Returns the title of the book */
    public String getTitle() {
        return title;
    }
    
    /** Returns a string containing the title and price of the Book */
    public String getBookInfo() {
        return title + "-" + price;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
}
