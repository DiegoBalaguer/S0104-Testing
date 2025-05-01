package level01.exercise01.data;

import level01.exercise01.model.Book;
import level01.exercise01.model.Library;

/**
 * PROGRAM: AddBooks
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class AddBooks {

    public static void addBooksIntoLibrary(Library library) {
        library.addBook(new Book("La historia de la vida"));
        library.addBook(new Book("Como cocinar por 1€"));
        library.addBook(new Book("Como programar en Java en 24 dias"));
        library.addBook(new Book("El entorno de Unix"));
        library.addBook(new Book("Alan Turing: el legado de un genio"));
        library.addBook(new Book("Magos y semidioses"));

    }
}

/*
        library.addBook(new Book("Alan Turing: el legado de un genio"));
        library.addBook(new Book("Como cocinar por 1€"));
        library.addBook(new Book("Como programar en Java en 24 dias"));
        library.addBook(new Book("El entorno de Unix"));
        library.addBook(new Book("La historia de la vida"));
        library.addBook(new Book("Magos y semidioses"));





 */
