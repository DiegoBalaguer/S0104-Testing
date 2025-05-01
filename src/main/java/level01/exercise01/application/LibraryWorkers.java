package level01.exercise01.application;

import level01.exercise01.model.Book;
import level01.exercise01.model.Library;

import static level01.exercise01.data.AddBooks.addBooksIntoLibrary;

/**
 * PROGRAM: LibraryManager
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class LibraryWorkers {

    private Library library;

    public LibraryWorkers(Library library) {
        this.library = library;
    }

    public void run() {
        System.out.println("* LIBRARY.........................." + System.lineSeparator());

        System.out.println("** Load books into library..........." + System.lineSeparator());

        addBooksIntoLibrary(library);

        System.out.println("** Books into library..........." + System.lineSeparator());

        System.out.println(library.getBooks() + System.lineSeparator());

        System.out.println("** Title book by id..........." + System.lineSeparator());

        try {
            System.out.println(library.getTitle(2) + System.lineSeparator());
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("** Add book with id (Nuevo libro de punto de cruz)..........." + System.lineSeparator());

        try {
            library.addBookById(2, new Book("Nuevo libro de punto de cruz"));
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println(library.getBooks() + System.lineSeparator());

        System.out.println("** Remove book by title (Nuevo libro de punto de cruz)................." + System.lineSeparator());

        try {
            library.removeBookByTitle("Nuevo libro de punto de cruz");
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("** Books into library..........." + System.lineSeparator());
        System.out.println(library.getBooks() + System.lineSeparator());
    }
}

