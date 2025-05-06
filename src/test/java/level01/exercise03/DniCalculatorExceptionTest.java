package level01.exercise03;

import level01.exercise03.data.DataTestDni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * PROGRAM: DniExceptionTest
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DniCalculatorExceptionTest {

    @Test
    void givenGetDniByIndex_whenIndexIsOutOfBounds_thenThrowsIndexOutOfBoundsException() {
        DataTestDni actualListDni = new DataTestDni();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            actualListDni.getDniTestByIndex(10);
        });
    }
}

