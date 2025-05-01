package level01.exercise03.application;

import level01.exercise03.data.DataTestDni;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class ApplicationController {

    public void run() {
        DataTestDni listDniTest = new DataTestDni();
        System.out.println("LIST DNI AND VALIDATE..............");
        for (int i = 0; i < listDniTest.getDniTest().size() - 1; i++) {
            System.out.println("DNI: " + listDniTest.getDniTestByIndex(i));
        }
        try {
            System.out.println("DNI: " + listDniTest.getDniTestByIndex(listDniTest.getDniTest().size()));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}