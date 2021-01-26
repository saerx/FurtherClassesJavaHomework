import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int getBooks(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }
}
