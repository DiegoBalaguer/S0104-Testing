package level01.exercise01.application;

import level01.exercise01.model.Library;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 19/04/2025
 */

public class ApplicationController {

    private final Library library;

    public ApplicationController() {
        this.library = new Library();
    }

    public void run() {
        LibraryWorkers libraryWorkers = new LibraryWorkers(library);
        libraryWorkers.run();
    }
}