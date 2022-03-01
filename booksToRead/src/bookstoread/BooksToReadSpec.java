package bookstoread;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooksToReadSpec {

    @Test
    public void shelfEmptyWhenNoBookAddedTest() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), "Bookshelf should be empty");
    }



    @Test
    public void shelfCanAddBooksTest(){
        BookShelf shelf = new BookShelf();
        shelf.add("Effective Java");
        shelf.add("Code Complete");
        List <String> books = shelf.books();
        assertEquals(2, books.size(), "BookShelf should have two books");
    }

}
