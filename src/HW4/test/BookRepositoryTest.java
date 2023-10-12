import HW4.main.Book;
import HW4.main.BookRepository;
import HW4.main.BookService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {
    @Test
    public void findBookByIdComplete() {
        Book book1 = mock(Book.class);
        when(book1.getId()).thenReturn("1");
        Book book2 = mock(Book.class);
        when(book2.getId()).thenReturn("2");
        Book book3 = mock(Book.class);
        when(book3.getId()).thenReturn("3");
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById("1")).thenReturn(book1);
        when(bookRepository.findById("2")).thenReturn(book2);
        when(bookRepository.findById("3")).thenReturn(book3);
        BookService bookService = new BookService(bookRepository);
        assertEquals(bookService.findBookById("1").getId(), "1");
        verify(bookRepository, times(1)).findById("1");
        verify(book1, times(1)).getId();
        assertEquals(bookService.findBookById("2").getId(), "2");
        assertEquals(bookService.findBookById("3").getId(), "3");
        assertNull(bookService.findBookById("4"));
        verify(bookRepository, times(1)).findById("4");
    }

    @Test
    public void findAllComplete() {
        BookRepository bookRepository = mock(BookRepository.class);
        List<Book> fakeData = Arrays.asList(
                new Book("1", "Book 1", "Author 1"),
                new Book("2", "Book 2", "Author 2"),
                new Book("3", "Book 3", "Author 3")
        );
        when(bookRepository.findAll()).thenReturn(fakeData);

        BookService bookService = new BookService(bookRepository);
        List<Book> result = bookService.findAllBooks();
        verify(bookRepository, times(1)).findAll();
        assertEquals(fakeData, result);
    }
}