package assertions.assertTrue;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {

    @Test
    public void assertTrueWithNoMessage(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty());
    }

    @Test
    public void assertTrueWithBooleanSupplierNoMessage(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(() -> listOfBooks.isEmpty());
    }


    @Test
    public void assertTrueWithMessage(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty(), "List of books is not empty");
    }

    @Test
    public void assertTrueWithBooleanSupplierMessage(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(() -> listOfBooks.isEmpty(), "List of books is not empty");
    }

    @Test
    public void assertTrueWithMessageSupplier(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty(), () -> "List of books is not empty");
    }

    @Test
    public void assertTrueWithBooleanSupplierAndMessageSupplier(){
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");

        List<Book> listOfBooks = bookService.books();

        assertTrue(() -> listOfBooks.isEmpty(), () -> "List of books is not empty");
    }



}
