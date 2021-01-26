import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library berkeley;
    private Library smallLibe;
    private Book childrenOfTime;
    private Book betterProgrammer;
    private Book codingInterview;
    private Borrower mildred;

    @Before
    public void before(){
        berkeley = new Library(20);
        smallLibe = new Library(1);
        childrenOfTime = new Book("Children of Time", "Adrian Tchaikovsky", "Science Fiction");
        betterProgrammer = new Book("Becoming a Better Programmer", "Pete Goodliffe", "Computer Science");
        codingInterview = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "Computer Science");
        mildred = new Borrower("Mildred");



    }

    @Test
    public void booksStartAt0(){
        assertEquals(0, berkeley.getBooks());
    }

    @Test
    public void canAddBook(){
        berkeley.addBook(childrenOfTime);
        berkeley.addBook(betterProgrammer);
        assertEquals(2, berkeley.getBooks());
    }

    @Test
    public void wontAddIfCapacity(){
        smallLibe.addBook(childrenOfTime);
        smallLibe.addBook(betterProgrammer);
        assertEquals(1, smallLibe.getBooks());
    }

    @Test
    public void borrowersCanBorrow(){
        berkeley.addBook(childrenOfTime);
        berkeley.addBook(betterProgrammer);
        berkeley.addBook(codingInterview);
        berkeley.lendBook(mildred, childrenOfTime);
        assertEquals(2, berkeley.getBooks());
        assertEquals(1, mildred.getBooks());
    }


}
