package level01.exercise02;

import level01.exercise02.data.DataTestDni;
import level01.exercise02.model.Dni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * PROGRAM: DniTest
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DniTest {

    @Test
    void givenValidDniNumber_whenValidateDni_thenReturnsTrue() {
        DataTestDni listDniActual = new DataTestDni();

        for (String dniActual : listDniActual.getDniTest()) {
            assertTrue(Dni.isCorrectDNI(dniActual));
        }
    }
}
