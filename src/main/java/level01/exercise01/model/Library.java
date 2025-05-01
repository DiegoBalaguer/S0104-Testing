package level01.exercise01.model;

import level01.exercise01.exceptions.BookIndexOutOfLimits;
import level01.exercise01.exceptions.BookNotExistException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * PROGRAM: Library
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            sortBooks();
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getTitle(int idBook) throws BookIndexOutOfLimits {
        try {
            return books.get(idBook).getTitle();
        } catch (Exception e) {
            throw new BookIndexOutOfLimits();
        }
    }

    public void addBookById(int idBook, Book bookInsert) throws BookIndexOutOfLimits {
        try {
            books.add(idBook, bookInsert);
            sortBooks();
        } catch (Exception e) {
            throw new BookIndexOutOfLimits();
        }
    }

    public void removeBookByTitle(String title) throws BookNotExistException {
        try {
            books.removeIf(book -> book.getTitle().equals(title));
            sortBooks();
        } catch (Exception e) {
            throw new BookNotExistException();
        }
    }

    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }
}
