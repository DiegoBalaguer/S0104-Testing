package level01.exercise01.model;

/**
 * PROGRAM: Book
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equalsIgnoreCase(book.title);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}' + "\n";
    }
}
