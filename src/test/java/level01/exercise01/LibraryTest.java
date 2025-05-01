package level01.exercise01;

import level01.exercise01.model.Book;
import level01.exercise01.model.Library;
import static level01.exercise01.data.AddBooks.addBooksIntoLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PROGRAM: LibraryTest
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        addBooksIntoLibrary(library);
    }

    @Test
    void givenLibraryWithBooks_whenCheckingBookList_thenBookListIsNotNull() {

        assertNotNull(library.getBooks(), "The book list should not be null after adding books.");
    }

    @Test
    void givenMultipleBooksAdded_whenCheckingLibrarySize_thenSizeIsCorrect() {

        assertEquals(6, library.getBooks().size(), "List should be size 6");
    }

    @Test
    void givenBookList_whenGettingTitleAtIndex_thenReturnsCorrectTitle() {

        assertDoesNotThrow(() -> {
            String bookActual = "Alan Turing: el legado de un genio";
            String bookExpected = library.getTitle(0);

            assertEquals(bookActual, bookExpected);
        });
    }

    @Test
    void givenDuplicateBook_whenAdded_thenLibraryContainsOnlyOneInstance() {
        Book bookActual = new Book("Alan Turing: el legado de un genio");

        library.addBook(bookActual);

        assertEquals(6, library.getBooks().size(), "We insert a book that we already have in the library and the number of books does not change.");
    }

    @Test
    void givenBooks_whenGettingTitleByIndex_thenReturnsCorrectBook() {

        assertDoesNotThrow(() -> {
            String bookActual = "El entorno de Unix";
            String bookExpected = library.getTitle(3);

            assertEquals(bookActual, bookExpected);
        });
    }

    @Test
    public void givenBookAdded_whenCheckingLibrarySize_thenSizeIsCorrect() {
        Book bookActual = new Book("Viaje a la Luna");
        library.addBook(bookActual);

        assertEquals(7, library.getBooks().size());
    }

    @Test
    public void givenBookDeleted_whenCheckingLibrarySize_thenSizeDecreasedCorrectly() {

        assertDoesNotThrow(() -> {
            String bookActual = library.getTitle(2);
            library.removeBookByTitle(bookActual);
        });

        assertEquals(5, library.getBooks().size());
    }

    @Test
    public void givenBooksAdded_whenCheckingAlphabeticalOrder_thenOrderRemainsCorrect() {

        assertDoesNotThrow(() -> {
            assertEquals("Alan Turing: el legado de un genio", library.getTitle(0));
            assertEquals("Como cocinar por 1€", library.getTitle(1));
            assertEquals("Como programar en Java en 24 dias", library.getTitle(2));
            assertEquals("El entorno de Unix", library.getTitle(3));
            assertEquals("La historia de la vida", library.getTitle(4));
            assertEquals("Magos y semidioses", library.getTitle(5));
        });
    }

    @Test
    public void givenBookDeleted_whenCheckingAlphabeticalOrder_thenOrderRemainsCorrect() {

        assertDoesNotThrow(() -> {
            library.removeBookByTitle("Como programar en Java en 24 dias");

            assertEquals("Alan Turing: el legado de un genio", library.getTitle(0));
            assertEquals("Como cocinar por 1€", library.getTitle(1));
            assertEquals("El entorno de Unix", library.getTitle(2));
            assertEquals("La historia de la vida", library.getTitle(3));
            assertEquals("Magos y semidioses", library.getTitle(4));
        });
    }
}
