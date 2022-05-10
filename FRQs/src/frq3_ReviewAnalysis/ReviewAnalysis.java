package frq3_ReviewAnalysis;

import java.util.ArrayList;

/**
 * Class ReviewAnalysis is part of Question 3 from the FRQs in the 2022 AP
 * Computer Science A exam. Problem definition from page 10 in:
 * https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 */
public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /**
     * Initializes allReviews to contain all the review objects to be analyzed
     */
    public ReviewAnalysis() {
        /* implementation not relevant */
    }

    /**
     * Returns a double representing the average rating of all the Review objects to
     * be analyzed, as described in part (a) Precondition: allReviews contains at
     * least one Review No element of allReviews is null.
     */
    public double getAverageRating() {
        
        /* IMPLEMENTATION FOR PART (A) */
        int total = allReviews[0].getRating();

        for (Review r : allReviews) {
            total += r.getRating();
        }

        return (double) (total / allReviews.length);
    }

    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b) Precondition: allReviews
     * contains at least one Review. No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
        
        /* IMPLEMENTATION FOR PART (B) */
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < allReviews.length; i++) {
            String comment = allReviews[i].getComment();
            if (comment.indexOf("!") != -1) {
                String ending = "!.";
                
                // if the last character of the comment is not in an expected set,
                // correct the comment by appending a period to it.
                if (comment.indexOf(ending.substring(comment.length() - 1)) == -1) {
                    comment += ".";
                }
                arr.add(i + "-" + comment);
            }
        }
      
        return arr;
    }
}
