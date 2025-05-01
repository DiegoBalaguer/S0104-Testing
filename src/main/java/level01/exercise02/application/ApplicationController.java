package level01.exercise02.application;

import level01.exercise02.data.DataTestDni;
import level01.exercise02.model.Dni;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class ApplicationController {

    public void run() {
        DataTestDni listDniTest = new DataTestDni();
        System.out.println("LIST DNI AND VALIDATE..............");
        for (String dniTest : listDniTest.getDniTest()) {
            System.out.println("DNI: " + dniTest + (Dni.isCorrectDNI(dniTest) ? " DNI CORRECT" : " DNI WRONG"));
        }
    }
}