package level01.exercise01.exceptions;

/**
 * PROGRAM: BookNotExistException
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class BookNotExistException extends Exception {
    public BookNotExistException() {
        super("Book no exists in Library");
    }
}
