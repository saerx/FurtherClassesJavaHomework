import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower mildred;
    private Book childrenOfTime;
    private Book betterProgrammer;
    private Book codingInterview;

    @Before
    public void before(){
        mildred = new Borrower("Mildred");
        childrenOfTime = new Book("Children of Time", "Adrian Tchaikovsky", "Science Fiction");
        betterProgrammer = new Book("Becoming a Better Programmer", "Pete Goodliffe", "Computer Science");
        codingInterview = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "Computer Science");
    }

    @Test
    public void canAddBook(){
        mildred.addBook(childrenOfTime);
        mildred.addBook(betterProgrammer);
        assertEquals(2, mildred.getBooks());
    }

}
