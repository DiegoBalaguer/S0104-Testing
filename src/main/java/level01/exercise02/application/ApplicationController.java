package level01.exercise02.application;

import level01.exercise02.data.DataTestDni;
import level01.exercise02.model.DniCalculator;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class ApplicationController {

    public void run() {
        System.out.println("LIST DNI AND VALIDATE..............");
        for (String dniTest : DataTestDni.getDniTest()) {
            int numberDni = DniCalculator.getNumberDni(dniTest);
            char letterDni = DniCalculator.getLetterDni(dniTest);
            char letterDniTest = DniCalculator.calculateLetterDni(numberDni);
            System.out.println(
                    "The DNI's letter: " + dniTest + ((letterDni == letterDniTest) ? " IS CORRECT" : " IS WRONG - Letter correct is: " +
                            DniCalculator.calculateLetterDni(numberDni)));
        }
    }
}