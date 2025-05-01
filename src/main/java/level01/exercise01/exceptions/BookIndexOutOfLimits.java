package level01.exercise01.exceptions;

/**
 * PROGRAM: BookIndexOutOfLimits
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class BookIndexOutOfLimits extends Exception {
    public BookIndexOutOfLimits() {
        super("Book index is out of limits");
    }
}