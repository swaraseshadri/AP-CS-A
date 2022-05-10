package frq2_TextBook;

/**
 * Class TextBook is the answer to Question 2 from the FRQs in the
 * 2022 AP Computer Science A exam.
 * Problem definition from page 8 in:
 * https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 */

/* TO BE IMPLEMENTED COMPLETLY FOR THIS QUESTION */
public class TextBook extends Book {
    private int edition;

    public TextBook(String bookTitle, double bookPrice, int bookEdition) {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(TextBook t) {
        return getTitle() == t.getTitle()
            || getEdition() >= t.getEdition();
    }
}