package QuesSixteen.ProgramFour;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkOutBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book checked out: " + book);
        } else {
            System.out.println("Book not found in library.");
        }
    }
}