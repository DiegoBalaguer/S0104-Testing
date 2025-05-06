package level01.exercise02;

import level01.exercise02.data.DataTestDni;
import level01.exercise02.model.DniCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PROGRAM: DniTest
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DniCalculatorTest {
    static Stream<String> provideDniData() {
        return DataTestDni.getDniTest().stream();
    }

    @ParameterizedTest
    @MethodSource("provideDniData")
    void givenNumberAndLetter_whenValidateDni_thenReturnsTrue(String dniTest) {
        int actualNumberDni = DniCalculator.getNumberDni(dniTest);
        char actualLetterDni = DniCalculator.getLetterDni(dniTest);
        char expectedLetterDni = DniCalculator.calculateLetterDni(actualNumberDni);

        assertEquals(expectedLetterDni, actualLetterDni, "incorrect letter for DNI, leter correct is: " + expectedLetterDni);
    }
}
