package frq3_ReviewAnalysis;

/**
 * Class Review is part of Question 3 from the FRQs in the
 * 2022 AP Computer Science A exam.
 * Problem definition from page 10 in:
 * https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 */
public class Review {
    private int rating;
    private String comment;
    
    /** Precondition: r >= 0
     *      c is not null.
     */
    public Review(int r, String c) {
        rating = r;
        comment = c;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String getComment() {
        return comment;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
}
