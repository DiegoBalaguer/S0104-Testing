package level01.exercise02.model;

import java.util.List;

/**
 * PROGRAM: Dni
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DniCalculator {

    private static final List<Character> LETTERS_DNI = List.of(
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
            'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'
    );

    public static boolean isCorrectDNI(String dni) {
        return (getLetterDni(dni) == calculateLetterDni(getNumberDni(dni)));
    }

    public static char calculateLetterDni(int dni) {
        return LETTERS_DNI.get(dni % 23);
    }

    public static int getNumberDni(String dni) {
        return Integer.parseInt((String) dni.subSequence(0, dni.length() - 1));
    }

    public static char getLetterDni(String dni) {
        return Character.toUpperCase(dni.charAt(dni.length() - 1));
    }
}
