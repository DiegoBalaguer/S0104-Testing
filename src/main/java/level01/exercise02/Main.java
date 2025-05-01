package level01.exercise02;

import level01.exercise02.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Main {

    public static void main(String[] args) {

        ApplicationController applicationController = new ApplicationController();

        applicationController.run();
        System.out.println("PROCESS FINISHED...");
    }
}