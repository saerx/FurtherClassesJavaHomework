import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBooks(){
        return this.books.size();
    }

    public boolean checkStockHasCapacity(){
        int currentBooks = this.getBooks();
        if (this.capacity <= currentBooks){
        return false;
        } else {
            return true;
        }
    }

    public void addBook(Book book){
        if (this.checkStockHasCapacity()) {
            this.books.add(book);
        }
    }
}
